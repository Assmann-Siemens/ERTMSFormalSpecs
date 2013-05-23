﻿// ------------------------------------------------------------------------------
// -- Copyright ERTMS Solutions
// -- Licensed under the EUPL V.1.1
// -- http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
// --
// -- This file is part of ERTMSFormalSpec software and documentation
// --
// --  ERTMSFormalSpec is free software: you can redistribute it and/or modify
// --  it under the terms of the EUPL General Public License, v.1.1
// --
// -- ERTMSFormalSpec is distributed in the hope that it will be useful,
// -- but WITHOUT ANY WARRANTY; without even the implied warranty of
// -- MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
// --
// ------------------------------------------------------------------------------
namespace Reports.Importer
{
    using MigraDoc.DocumentObjectModel;

    /// <summary>
    /// Generates the report based on the result of the Delta import
    /// </summary>
    public class DeltaImportReport : ReportTools
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="doc"></param>
        public DeltaImportReport(Document doc)
            : base(doc)
        {
        }

        /// <summary>
        /// The maximum text bound
        /// </summary>
        private const int TEXT_BOUND = 2048;

        /// <summary>
        /// Shortens the text provided if greated than a given bound
        /// </summary>
        /// <param name="text"></param>
        /// <returns></returns>
        private string ValidText(string text)
        {
            string retVal = text;

            if (retVal == null)
            {
                retVal = "";
            }

            if (retVal.Length > TEXT_BOUND)
            {
                retVal = retVal.Substring(0, TEXT_BOUND) + "...";
            }

            return retVal;
        }

        /// <summary>
        /// Fills the document whith the result of the import
        /// </summary>
        /// <param name="importResult"></param>
        public void CreateDocument(Importers.RtfDeltaImporter.Document importResult)
        {
            AddParagraph("This document lists the changes that have been applied during the imporation of a new release of the specification");

            AddSubParagraph("Modified paragraphs");
            AddParagraph("This section lists the paragraphs that have been modified during the importation");
            foreach (Importers.RtfDeltaImporter.Paragraph paragraph in importResult.ChangedParagraphs)
            {
                AddSubParagraph(paragraph.Id);
                AddSubParagraph("Original contents");
                AddParagraph(ValidText(paragraph.OriginalText));
                CloseSubParagraph();
                AddSubParagraph("New contents");
                AddParagraph(ValidText(paragraph.Text));
                CloseSubParagraph();
                CloseSubParagraph();
            }
            CloseSubParagraph();

            AddSubParagraph("New paragraphs");
            AddParagraph("This section lists the paragraphs that have been added during the importation");
            foreach (Importers.RtfDeltaImporter.Paragraph paragraph in importResult.NewParagraphs)
            {
                AddSubParagraph(paragraph.Id);
                AddParagraph(ValidText(paragraph.Text));
                CloseSubParagraph();
            }
            CloseSubParagraph();
            AddSubParagraph("Removed paragraphs");
            AddParagraph("This section lists the paragraphs that have been removed during the importation");
            foreach (Importers.RtfDeltaImporter.Paragraph paragraph in importResult.RemovedParagraphs)
            {
                AddSubParagraph(paragraph.Id);
                AddParagraph(ValidText(paragraph.Text));
                CloseSubParagraph();
            }
            CloseSubParagraph();
        }
    }
}