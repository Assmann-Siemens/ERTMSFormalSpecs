// ------------------------------------------------------------------------------
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
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Windows.Forms;

namespace GUI.DataDictionaryView
{
    public class CollectionTreeNode : TypeTreeNode<DataDictionary.Types.Collection>
    {
        private class InternalTypesConverter : TypesConverter
        {
            public override StandardValuesCollection
            GetStandardValues(ITypeDescriptorContext context)
            {
                return GetValues(((ItemEditor)context.Instance).Item);
            }
        }

        /// <summary>
        /// The editor for Range types
        /// </summary>
        private class ItemEditor : TypeEditor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public ItemEditor()
                : base()
            {
            }

            [Category("Description")]
            public override string Name
            {
                get { return base.Name; }
                set { base.Name = value; }
            }

            /// <summary>
            /// The variable type
            /// </summary>
            [Category("Description"), TypeConverter(typeof(InternalTypesConverter))]
            public string Type
            {
                get { return Item.getTypeName(); }
                set
                {
                    Item.Type = null;
                    Item.setTypeName(value);
                }
            }

            /// <summary>
            /// The default value of the variable
            /// </summary>
            [Category("Description")]
            public string DefaultValue
            {
                get { return Item.getDefault(); }
                set
                {
                    Item.Default = null;
                    Item.setDefault(value);
                }
            }

            /// <summary>
            /// The default value of the variable
            /// </summary>
            [Category("Description")]
            public int MaxSize
            {
                get { return Item.getMaxSize(); }
                set { Item.setMaxSize(value); }
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public CollectionTreeNode(DataDictionary.Types.Collection item)
            : base(item)
        {
        }

        /// <summary>
        /// Creates the editor for this tree node
        /// </summary>
        /// <returns></returns>
        protected override Editor createEditor()
        {
            return new ItemEditor();
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }
    }
}
