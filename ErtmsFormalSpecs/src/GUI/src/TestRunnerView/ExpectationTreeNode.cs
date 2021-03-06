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
using System.ComponentModel.Design;
using System.Drawing.Design;
using System.Windows.Forms;

namespace GUI.TestRunnerView
{
    public class ExpectationTreeNode : DataTreeNode<DataDictionary.Tests.Expectation>
    {
        /// <summary>
        /// The value editor
        /// </summary>
        private class ItemEditor : Editor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public ItemEditor()
                : base()
            {
            }

            [Category("Description"), Editor(typeof(MultilineStringEditor), typeof(UITypeEditor))]
            public string Expression
            {
                get { return Item.getValue(); }
                set { Item.setValue(value); }
            }

            [Category("Description")]
            public bool Blocking
            {
                get { return Item.getBlocking(); }
                set { Item.setBlocking(value); }
            }

            [Category("Description"), TypeConverter(typeof(ExpectationKindConverter))]
            [ReadOnly(false)]
            public DataDictionary.Generated.acceptor.ExpectationKind Kind
            {
                get { return Item.getKind(); }
                set
                {
                    Item.setKind(value);
                    UpdateActivation();
                }
            }

            [Category("Description"), DisplayName("While condition"), Editor(typeof(MultilineStringEditor), typeof(UITypeEditor))]
            [ReadOnly(true)]
            public string Condition
            {
                get { return Item.getCondition(); }
                set { Item.setCondition(value); }
            }

            [Category("Description")]
            public double DeadLine
            {
                get { return Item.DeadLine; }
                set { Item.DeadLine = value; }
            }

            /// <summary>
            /// Updates the activation state of each entry, according to the values of the edited element
            /// </summary>
            protected override void UpdateActivation()
            {
                UpdateFieldActivation("Condition", Item.getKind() != DataDictionary.Generated.acceptor.ExpectationKind.aContinuous);
            }

        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public ExpectationTreeNode(DataDictionary.Tests.Expectation item)
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

        /// <summary>
        /// Creates sub sequence tree nodes
        /// </summary>
        /// <param name="elements">The elements to be placed in the node</param>
        public static List<BaseTreeNode> CreateExpectations(System.Collections.ArrayList elements)
        {
            List<BaseTreeNode> retVal = new List<BaseTreeNode>();

            foreach (DataDictionary.Tests.Expectation expectation in elements)
            {
                retVal.Add(new ExpectationTreeNode(expectation));
            }

            return retVal;
        }
    }
}
