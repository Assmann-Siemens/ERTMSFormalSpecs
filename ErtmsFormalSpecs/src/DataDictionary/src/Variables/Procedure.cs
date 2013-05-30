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
using System.Collections.Generic;

namespace DataDictionary.Variables
{
    public class Procedure : Generated.Procedure, Utils.ISubDeclarator, IProcedure, IVariable, Values.IValue, TextualExplain
    {
        /// <summary>
        /// The current state of the state machine
        /// (only used for root state machines, declared in a procedure)
        /// </summary>
        private Variables.Variable currentState;
        public Variables.Variable CurrentState
        {
            get
            {
                if (currentState == null && StateMachine.States.Count > 0)
                {
                    currentState = (Variables.Variable)Generated.acceptor.getFactory().createVariable();
                    currentState.Name = "CurrentState";
                    currentState.Type = StateMachine;
                    currentState.Value = StateMachine.DefaultValue;
                    currentState.Mode = Generated.acceptor.VariableModeEnumType.aInternal;
                    currentState.setFather(this);
                }

                return currentState;
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        public Procedure()
            : base()
        {
        }


        /// <summary>
        /// Indicates if this Procedure contains implemented sub-elements
        /// </summary>
        public override bool ImplementationPartiallyCompleted
        {
            get
            {
                if (getImplemented() || StateMachine.ImplementationPartiallyCompleted)
                {
                    return true;
                }

                foreach (DataDictionary.Rules.Rule rule in Rules)
                {
                    if (rule.ImplementationPartiallyCompleted)
                    {
                        return true;
                    }
                }

                return false;
            }
        }

        /// <summary>
        /// Initialises the declared elements 
        /// </summary>
        public void InitDeclaredElements()
        {
        }

        /// <summary>
        /// The elements declared by this variable
        /// </summary>
        public Dictionary<string, List<Utils.INamable>> DeclaredElements
        {
            get
            {
                Dictionary<string, List<Utils.INamable>> retVal = StateMachine.DeclaredElements;

                Utils.ISubDeclaratorUtils.AppendNamable(retVal, CurrentState);
                foreach (Parameter parameter in FormalParameters)
                {
                    Utils.ISubDeclaratorUtils.AppendNamable(retVal, parameter);
                }

                return retVal;
            }
        }

        /// <summary>
        /// Appends the INamable which match the name provided in retVal
        /// </summary>
        /// <param name="name"></param>
        /// <param name="retVal"></param>
        public void Find(string name, List<Utils.INamable> retVal)
        {
            if (CurrentState != null && CurrentState.Name.CompareTo(name) == 0)
            {
                retVal.Add(CurrentState);
            }
            else
            {
                StateMachine.Find(name, retVal);
            }

            foreach (Parameter item in FormalParameters)
            {
                if (item.Name.CompareTo(name) == 0)
                {
                    retVal.Add(item);
                    break;
                }
            }
        }

        /// <summary>
        /// The enclosing name space
        /// </summary>
        public Types.NameSpace NameSpace
        {
            get { return EnclosingNameSpaceFinder.find(this); }
        }

        /// <summary>
        /// The enclosing structure
        /// </summary>
        public Types.Structure Structure
        {
            get { return Utils.EnclosingFinder<Types.Structure>.find(this); }
        }

        /// <summary>
        /// Parameters of the procedure
        /// </summary>
        public System.Collections.ArrayList FormalParameters
        {
            get
            {
                if (allParameters() == null)
                {
                    setAllParameters(new System.Collections.ArrayList());
                }
                return allParameters();
            }
            set { setAllParameters(value); }
        }


        /// <summary>
        /// Provides the formal parameter whose name corresponds to the name provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public Parameter getFormalParameter(string name)
        {
            Parameter retVal = null;

            foreach (Parameter parameter in FormalParameters)
            {
                if (parameter.Name.CompareTo(name) == 0)
                {
                    retVal = parameter;
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// The procedure return type
        /// </summary>
        public Types.Type ReturnType
        {
            get { return EFSSystem.NoType; }
        }

        /// <summary>
        /// Provides the enclosing collection, for deletion
        /// </summary>
        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                if (Structure != null)
                {
                    return Structure.Procedures;
                }
                else if (NameSpace != null)
                {
                    return NameSpace.Procedures;
                }

                return null;
            }
        }

        /// <summary>
        /// The procedure state machine
        /// </summary>
        public Types.StateMachine StateMachine
        {
            get
            {
                if (getStateMachine() == null)
                {
                    Types.StateMachine stateMachine = (Types.StateMachine)Generated.acceptor.getFactory().createStateMachine();
                    setStateMachine(stateMachine);
                    stateMachine.setFather(this);
                }
                return (Types.StateMachine)getStateMachine();
            }
            set { setStateMachine(value); }
        }

        /// <summary>
        /// The default value
        /// </summary>
        public string Default
        {
            get { return StateMachine.getDefault(); }
            set { StateMachine.setDefault(value); }
        }

        /// <summary>
        /// The complete name to access the value
        /// </summary>
        public string LiteralName { get { return ToString(); } }

        /// <summary>
        /// Creates a valid right side IValue, according to the target variable (left side)
        /// </summary>
        /// <param name="variable">The target variable</param>
        /// <param name="duplicate">Indicates that a duplication of the variable should be performed</param>
        /// <returns></returns>
        public Values.IValue RightSide(Variables.IVariable variable, bool duplicate)
        {
            return this;
        }

        /// <summary>
        /// Provides the type name of the element
        /// </summary>
        public string TypeName { get { return ToString(); } }

        /// <summary>
        /// The type of the element
        /// </summary>
        public Types.Type Type { get { return EFSSystem.NoType; } set { } }

        /// <summary>
        /// Provides the mode of the typed element
        /// </summary>
        public DataDictionary.Generated.acceptor.VariableModeEnumType Mode { get { return Generated.acceptor.VariableModeEnumType.aConstant; } }

        /// <summary>
        /// The rules declared in this procedure
        /// </summary>
        public System.Collections.ArrayList Rules
        {
            get
            {
                if (allRules() == null)
                {
                    setAllRules(new System.Collections.ArrayList());
                }
                return allRules();
            }
            set
            {
                setAllRules(value);
            }
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            {
                Parameter item = element as Parameter;
                if (item != null)
                {
                    appendParameters(item);
                }
            }
            {
                Rules.Rule item = element as Rules.Rule;
                if (item != null)
                {
                    appendRules(item);
                }
            }

            base.AddModelElement(element);
        }

        /// <summary>
        /// Perform additional checks based on the parameter types
        /// </summary>
        /// <param name="root">The element on which the errors should be reported</param>
        /// <param name="context">The evaluation context</param>
        /// <param name="actualParameters">The parameters applied to this function call</param>
        public virtual void additionalChecks(ModelElement root, Dictionary<string, Interpreter.Expression> actualParameters)
        {
        }

        /// <summary>
        /// Provides an explanation of the rule's behaviour
        /// </summary>
        /// <param name="indentLevel">the number of white spaces to add at the beginning of each line</param>
        /// <returns></returns>
        public string getExplain(int indentLevel, bool getExplain)
        {
            string retVal = "";

            retVal =
                  TextualExplainUtilities.Pad("{\\cf11 // " + TextualExplainUtilities.Iterate('-', 6 + Name.Length) + "}\\cf1\\par", indentLevel)
                + TextualExplainUtilities.Pad("{PROCEDURE " + Name + "(\\par", indentLevel);

            foreach (Parameter parameter in FormalParameters)
            {
                retVal = retVal + TextualExplainUtilities.Pad(parameter.Name + ":" + parameter.TypeName + ",\\par", indentLevel + 2);
            }
            retVal = retVal + ")}\\par";

            foreach (Rules.Rule rule in Rules)
            {
                retVal += "\\par" + rule.getExplain(indentLevel + 2, true);
            }

            if (StateMachine.States.Count > 0)
            {
                retVal += TextualExplainUtilities.Pad("\\par{\\cf11 // The temporal behaviour of this procedure is defined by a state machine}\\cf1\\par", indentLevel + 2);
            }

            return retVal;
        }

        /// <summary>
        /// Provides the value of the variable
        /// </summary>
        public Values.IValue Value { get { return CurrentState.Value; } set { CurrentState.Value = value; } }

        /// <summary>
        /// Provides the default value to give to the variable
        /// </summary>
        public Values.IValue DefaultValue { get { return StateMachine.DefaultValue; } }

        /// <summary>
        /// Provides an explanation of the rule's behaviour
        /// </summary>
        /// <returns></returns>
        public string getExplain(bool explainSubElements)
        {
            string retVal = getExplain(0, true);

            return TextualExplainUtilities.Encapsule(retVal);
        }

    }
}
