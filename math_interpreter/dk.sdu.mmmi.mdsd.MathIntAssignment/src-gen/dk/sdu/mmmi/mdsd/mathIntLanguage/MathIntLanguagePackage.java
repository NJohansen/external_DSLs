/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.mathIntLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.mdsd.mathIntLanguage.MathIntLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface MathIntLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mathIntLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sdu.dk/mmmi/mdsd/MathIntLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mathIntLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MathIntLanguagePackage eINSTANCE = dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathExpImpl <em>Math Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathExpImpl
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl#getMathExp()
   * @generated
   */
  int MATH_EXP = 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP__EXP = 0;

  /**
   * The number of structural features of the '<em>Math Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATH_EXP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.ExpressionImpl
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.impl.NumberImpl <em>Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.NumberImpl
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl#getNumber()
   * @generated
   */
  int NUMBER = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.PlusImpl
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl#getPlus()
   * @generated
   */
  int PLUS = 3;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MinusImpl
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl#getMinus()
   * @generated
   */
  int MINUS = 4;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MultiplyImpl <em>Multiply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MultiplyImpl
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl#getMultiply()
   * @generated
   */
  int MULTIPLY = 5;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.impl.DivisionImpl <em>Division</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.DivisionImpl
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl#getDivision()
   * @generated
   */
  int DIVISION = 6;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Division</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIVISION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.MathExp <em>Math Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Math Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.MathExp
   * @generated
   */
  EClass getMathExp();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.MathExp#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.MathExp#getExp()
   * @see #getMathExp()
   * @generated
   */
  EReference getMathExp_Exp();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Number
   * @generated
   */
  EClass getNumber();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Number#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Number#getValue()
   * @see #getNumber()
   * @generated
   */
  EAttribute getNumber_Value();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Multiply <em>Multiply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiply</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Multiply
   * @generated
   */
  EClass getMultiply();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Multiply#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Multiply#getLeft()
   * @see #getMultiply()
   * @generated
   */
  EReference getMultiply_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Multiply#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Multiply#getRight()
   * @see #getMultiply()
   * @generated
   */
  EReference getMultiply_Right();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Division <em>Division</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Division</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Division
   * @generated
   */
  EClass getDivision();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Division#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Division#getLeft()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Left();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.Division#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see dk.sdu.mmmi.mdsd.mathIntLanguage.Division#getRight()
   * @see #getDivision()
   * @generated
   */
  EReference getDivision_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MathIntLanguageFactory getMathIntLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathExpImpl <em>Math Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathExpImpl
     * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl#getMathExp()
     * @generated
     */
    EClass MATH_EXP = eINSTANCE.getMathExp();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATH_EXP__EXP = eINSTANCE.getMathExp_Exp();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.ExpressionImpl
     * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.impl.NumberImpl <em>Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.NumberImpl
     * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl#getNumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getNumber();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.PlusImpl
     * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MinusImpl
     * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MultiplyImpl <em>Multiply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MultiplyImpl
     * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl#getMultiply()
     * @generated
     */
    EClass MULTIPLY = eINSTANCE.getMultiply();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLY__LEFT = eINSTANCE.getMultiply_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLY__RIGHT = eINSTANCE.getMultiply_Right();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.mathIntLanguage.impl.DivisionImpl <em>Division</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.DivisionImpl
     * @see dk.sdu.mmmi.mdsd.mathIntLanguage.impl.MathIntLanguagePackageImpl#getDivision()
     * @generated
     */
    EClass DIVISION = eINSTANCE.getDivision();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__LEFT = eINSTANCE.getDivision_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIVISION__RIGHT = eINSTANCE.getDivision_Right();

  }

} //MathIntLanguagePackage