/**
 * generated by Xtext 2.19.0
 */
package umlrtsyntesizer.execTraces.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import umlrtsyntesizer.execTraces.Edge;
import umlrtsyntesizer.execTraces.ExecTracesPackage;
import umlrtsyntesizer.execTraces.Node;
import umlrtsyntesizer.execTraces.TransStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.EdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.EdgeImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.EdgeImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.EdgeImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.EdgeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link umlrtsyntesizer.execTraces.impl.EdgeImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends MinimalEObjectImpl.Container implements Edge
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Node source;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected Node destination;

  /**
   * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected static final String TRIGGER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected String trigger = TRIGGER_EDEFAULT;

  /**
   * The default value of the '{@link #getActions() <em>Actions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected static final String ACTIONS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected String actions = ACTIONS_EDEFAULT;

  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final TransStatus STATUS_EDEFAULT = TransStatus.NORMAL;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected TransStatus status = STATUS_EDEFAULT;

  /**
   * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected static final String GUARD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected String guard = GUARD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EdgeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExecTracesPackage.Literals.EDGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (Node)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecTracesPackage.EDGE__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Node newSource)
  {
    Node oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExecTracesPackage.EDGE__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getDestination()
  {
    if (destination != null && destination.eIsProxy())
    {
      InternalEObject oldDestination = (InternalEObject)destination;
      destination = (Node)eResolveProxy(oldDestination);
      if (destination != oldDestination)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExecTracesPackage.EDGE__DESTINATION, oldDestination, destination));
      }
    }
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestination(Node newDestination)
  {
    Node oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExecTracesPackage.EDGE__DESTINATION, oldDestination, destination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTrigger()
  {
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrigger(String newTrigger)
  {
    String oldTrigger = trigger;
    trigger = newTrigger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExecTracesPackage.EDGE__TRIGGER, oldTrigger, trigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActions()
  {
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActions(String newActions)
  {
    String oldActions = actions;
    actions = newActions;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExecTracesPackage.EDGE__ACTIONS, oldActions, actions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransStatus getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(TransStatus newStatus)
  {
    TransStatus oldStatus = status;
    status = newStatus == null ? STATUS_EDEFAULT : newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExecTracesPackage.EDGE__STATUS, oldStatus, status));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuard(String newGuard)
  {
    String oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExecTracesPackage.EDGE__GUARD, oldGuard, guard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExecTracesPackage.EDGE__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case ExecTracesPackage.EDGE__DESTINATION:
        if (resolve) return getDestination();
        return basicGetDestination();
      case ExecTracesPackage.EDGE__TRIGGER:
        return getTrigger();
      case ExecTracesPackage.EDGE__ACTIONS:
        return getActions();
      case ExecTracesPackage.EDGE__STATUS:
        return getStatus();
      case ExecTracesPackage.EDGE__GUARD:
        return getGuard();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExecTracesPackage.EDGE__SOURCE:
        setSource((Node)newValue);
        return;
      case ExecTracesPackage.EDGE__DESTINATION:
        setDestination((Node)newValue);
        return;
      case ExecTracesPackage.EDGE__TRIGGER:
        setTrigger((String)newValue);
        return;
      case ExecTracesPackage.EDGE__ACTIONS:
        setActions((String)newValue);
        return;
      case ExecTracesPackage.EDGE__STATUS:
        setStatus((TransStatus)newValue);
        return;
      case ExecTracesPackage.EDGE__GUARD:
        setGuard((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExecTracesPackage.EDGE__SOURCE:
        setSource((Node)null);
        return;
      case ExecTracesPackage.EDGE__DESTINATION:
        setDestination((Node)null);
        return;
      case ExecTracesPackage.EDGE__TRIGGER:
        setTrigger(TRIGGER_EDEFAULT);
        return;
      case ExecTracesPackage.EDGE__ACTIONS:
        setActions(ACTIONS_EDEFAULT);
        return;
      case ExecTracesPackage.EDGE__STATUS:
        setStatus(STATUS_EDEFAULT);
        return;
      case ExecTracesPackage.EDGE__GUARD:
        setGuard(GUARD_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExecTracesPackage.EDGE__SOURCE:
        return source != null;
      case ExecTracesPackage.EDGE__DESTINATION:
        return destination != null;
      case ExecTracesPackage.EDGE__TRIGGER:
        return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
      case ExecTracesPackage.EDGE__ACTIONS:
        return ACTIONS_EDEFAULT == null ? actions != null : !ACTIONS_EDEFAULT.equals(actions);
      case ExecTracesPackage.EDGE__STATUS:
        return status != STATUS_EDEFAULT;
      case ExecTracesPackage.EDGE__GUARD:
        return GUARD_EDEFAULT == null ? guard != null : !GUARD_EDEFAULT.equals(guard);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (trigger: ");
    result.append(trigger);
    result.append(", actions: ");
    result.append(actions);
    result.append(", status: ");
    result.append(status);
    result.append(", guard: ");
    result.append(guard);
    result.append(')');
    return result.toString();
  }

} //EdgeImpl