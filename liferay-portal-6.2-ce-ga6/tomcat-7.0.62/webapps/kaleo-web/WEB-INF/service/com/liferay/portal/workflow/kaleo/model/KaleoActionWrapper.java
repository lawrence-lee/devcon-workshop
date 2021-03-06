/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KaleoAction}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoAction
 * @generated
 */
public class KaleoActionWrapper implements KaleoAction,
	ModelWrapper<KaleoAction> {
	public KaleoActionWrapper(KaleoAction kaleoAction) {
		_kaleoAction = kaleoAction;
	}


	public Class<?> getModelClass() {
		return KaleoAction.class;
	}


	public String getModelClassName() {
		return KaleoAction.class.getName();
	}


	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("kaleoActionId", getKaleoActionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("kaleoClassName", getKaleoClassName());
		attributes.put("kaleoClassPK", getKaleoClassPK());
		attributes.put("kaleoDefinitionId", getKaleoDefinitionId());
		attributes.put("kaleoNodeName", getKaleoNodeName());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("executionType", getExecutionType());
		attributes.put("script", getScript());
		attributes.put("scriptLanguage", getScriptLanguage());
		attributes.put("scriptRequiredContexts", getScriptRequiredContexts());
		attributes.put("priority", getPriority());

		return attributes;
	}


	public void setModelAttributes(Map<String, Object> attributes) {
		Long kaleoActionId = (Long)attributes.get("kaleoActionId");

		if (kaleoActionId != null) {
			setKaleoActionId(kaleoActionId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String kaleoClassName = (String)attributes.get("kaleoClassName");

		if (kaleoClassName != null) {
			setKaleoClassName(kaleoClassName);
		}

		Long kaleoClassPK = (Long)attributes.get("kaleoClassPK");

		if (kaleoClassPK != null) {
			setKaleoClassPK(kaleoClassPK);
		}

		Long kaleoDefinitionId = (Long)attributes.get("kaleoDefinitionId");

		if (kaleoDefinitionId != null) {
			setKaleoDefinitionId(kaleoDefinitionId);
		}

		String kaleoNodeName = (String)attributes.get("kaleoNodeName");

		if (kaleoNodeName != null) {
			setKaleoNodeName(kaleoNodeName);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String executionType = (String)attributes.get("executionType");

		if (executionType != null) {
			setExecutionType(executionType);
		}

		String script = (String)attributes.get("script");

		if (script != null) {
			setScript(script);
		}

		String scriptLanguage = (String)attributes.get("scriptLanguage");

		if (scriptLanguage != null) {
			setScriptLanguage(scriptLanguage);
		}

		String scriptRequiredContexts = (String)attributes.get(
				"scriptRequiredContexts");

		if (scriptRequiredContexts != null) {
			setScriptRequiredContexts(scriptRequiredContexts);
		}

		Integer priority = (Integer)attributes.get("priority");

		if (priority != null) {
			setPriority(priority);
		}
	}

	/**
	* Returns the primary key of this kaleo action.
	*
	* @return the primary key of this kaleo action
	*/

	public long getPrimaryKey() {
		return _kaleoAction.getPrimaryKey();
	}

	/**
	* Sets the primary key of this kaleo action.
	*
	* @param primaryKey the primary key of this kaleo action
	*/

	public void setPrimaryKey(long primaryKey) {
		_kaleoAction.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the kaleo action ID of this kaleo action.
	*
	* @return the kaleo action ID of this kaleo action
	*/

	public long getKaleoActionId() {
		return _kaleoAction.getKaleoActionId();
	}

	/**
	* Sets the kaleo action ID of this kaleo action.
	*
	* @param kaleoActionId the kaleo action ID of this kaleo action
	*/

	public void setKaleoActionId(long kaleoActionId) {
		_kaleoAction.setKaleoActionId(kaleoActionId);
	}

	/**
	* Returns the group ID of this kaleo action.
	*
	* @return the group ID of this kaleo action
	*/

	public long getGroupId() {
		return _kaleoAction.getGroupId();
	}

	/**
	* Sets the group ID of this kaleo action.
	*
	* @param groupId the group ID of this kaleo action
	*/

	public void setGroupId(long groupId) {
		_kaleoAction.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this kaleo action.
	*
	* @return the company ID of this kaleo action
	*/

	public long getCompanyId() {
		return _kaleoAction.getCompanyId();
	}

	/**
	* Sets the company ID of this kaleo action.
	*
	* @param companyId the company ID of this kaleo action
	*/

	public void setCompanyId(long companyId) {
		_kaleoAction.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this kaleo action.
	*
	* @return the user ID of this kaleo action
	*/

	public long getUserId() {
		return _kaleoAction.getUserId();
	}

	/**
	* Sets the user ID of this kaleo action.
	*
	* @param userId the user ID of this kaleo action
	*/

	public void setUserId(long userId) {
		_kaleoAction.setUserId(userId);
	}

	/**
	* Returns the user uuid of this kaleo action.
	*
	* @return the user uuid of this kaleo action
	* @throws SystemException if a system exception occurred
	*/

	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kaleoAction.getUserUuid();
	}

	/**
	* Sets the user uuid of this kaleo action.
	*
	* @param userUuid the user uuid of this kaleo action
	*/

	public void setUserUuid(java.lang.String userUuid) {
		_kaleoAction.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this kaleo action.
	*
	* @return the user name of this kaleo action
	*/

	public java.lang.String getUserName() {
		return _kaleoAction.getUserName();
	}

	/**
	* Sets the user name of this kaleo action.
	*
	* @param userName the user name of this kaleo action
	*/

	public void setUserName(java.lang.String userName) {
		_kaleoAction.setUserName(userName);
	}

	/**
	* Returns the create date of this kaleo action.
	*
	* @return the create date of this kaleo action
	*/

	public java.util.Date getCreateDate() {
		return _kaleoAction.getCreateDate();
	}

	/**
	* Sets the create date of this kaleo action.
	*
	* @param createDate the create date of this kaleo action
	*/

	public void setCreateDate(java.util.Date createDate) {
		_kaleoAction.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this kaleo action.
	*
	* @return the modified date of this kaleo action
	*/

	public java.util.Date getModifiedDate() {
		return _kaleoAction.getModifiedDate();
	}

	/**
	* Sets the modified date of this kaleo action.
	*
	* @param modifiedDate the modified date of this kaleo action
	*/

	public void setModifiedDate(java.util.Date modifiedDate) {
		_kaleoAction.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the kaleo class name of this kaleo action.
	*
	* @return the kaleo class name of this kaleo action
	*/

	public java.lang.String getKaleoClassName() {
		return _kaleoAction.getKaleoClassName();
	}

	/**
	* Sets the kaleo class name of this kaleo action.
	*
	* @param kaleoClassName the kaleo class name of this kaleo action
	*/

	public void setKaleoClassName(java.lang.String kaleoClassName) {
		_kaleoAction.setKaleoClassName(kaleoClassName);
	}

	/**
	* Returns the kaleo class p k of this kaleo action.
	*
	* @return the kaleo class p k of this kaleo action
	*/

	public long getKaleoClassPK() {
		return _kaleoAction.getKaleoClassPK();
	}

	/**
	* Sets the kaleo class p k of this kaleo action.
	*
	* @param kaleoClassPK the kaleo class p k of this kaleo action
	*/

	public void setKaleoClassPK(long kaleoClassPK) {
		_kaleoAction.setKaleoClassPK(kaleoClassPK);
	}

	/**
	* Returns the kaleo definition ID of this kaleo action.
	*
	* @return the kaleo definition ID of this kaleo action
	*/

	public long getKaleoDefinitionId() {
		return _kaleoAction.getKaleoDefinitionId();
	}

	/**
	* Sets the kaleo definition ID of this kaleo action.
	*
	* @param kaleoDefinitionId the kaleo definition ID of this kaleo action
	*/

	public void setKaleoDefinitionId(long kaleoDefinitionId) {
		_kaleoAction.setKaleoDefinitionId(kaleoDefinitionId);
	}

	/**
	* Returns the kaleo node name of this kaleo action.
	*
	* @return the kaleo node name of this kaleo action
	*/

	public java.lang.String getKaleoNodeName() {
		return _kaleoAction.getKaleoNodeName();
	}

	/**
	* Sets the kaleo node name of this kaleo action.
	*
	* @param kaleoNodeName the kaleo node name of this kaleo action
	*/

	public void setKaleoNodeName(java.lang.String kaleoNodeName) {
		_kaleoAction.setKaleoNodeName(kaleoNodeName);
	}

	/**
	* Returns the name of this kaleo action.
	*
	* @return the name of this kaleo action
	*/

	public java.lang.String getName() {
		return _kaleoAction.getName();
	}

	/**
	* Sets the name of this kaleo action.
	*
	* @param name the name of this kaleo action
	*/

	public void setName(java.lang.String name) {
		_kaleoAction.setName(name);
	}

	/**
	* Returns the description of this kaleo action.
	*
	* @return the description of this kaleo action
	*/

	public java.lang.String getDescription() {
		return _kaleoAction.getDescription();
	}

	/**
	* Sets the description of this kaleo action.
	*
	* @param description the description of this kaleo action
	*/

	public void setDescription(java.lang.String description) {
		_kaleoAction.setDescription(description);
	}

	/**
	* Returns the execution type of this kaleo action.
	*
	* @return the execution type of this kaleo action
	*/

	public java.lang.String getExecutionType() {
		return _kaleoAction.getExecutionType();
	}

	/**
	* Sets the execution type of this kaleo action.
	*
	* @param executionType the execution type of this kaleo action
	*/

	public void setExecutionType(java.lang.String executionType) {
		_kaleoAction.setExecutionType(executionType);
	}

	/**
	* Returns the script of this kaleo action.
	*
	* @return the script of this kaleo action
	*/

	public java.lang.String getScript() {
		return _kaleoAction.getScript();
	}

	/**
	* Sets the script of this kaleo action.
	*
	* @param script the script of this kaleo action
	*/

	public void setScript(java.lang.String script) {
		_kaleoAction.setScript(script);
	}

	/**
	* Returns the script language of this kaleo action.
	*
	* @return the script language of this kaleo action
	*/

	public java.lang.String getScriptLanguage() {
		return _kaleoAction.getScriptLanguage();
	}

	/**
	* Sets the script language of this kaleo action.
	*
	* @param scriptLanguage the script language of this kaleo action
	*/

	public void setScriptLanguage(java.lang.String scriptLanguage) {
		_kaleoAction.setScriptLanguage(scriptLanguage);
	}

	/**
	* Returns the script required contexts of this kaleo action.
	*
	* @return the script required contexts of this kaleo action
	*/

	public java.lang.String getScriptRequiredContexts() {
		return _kaleoAction.getScriptRequiredContexts();
	}

	/**
	* Sets the script required contexts of this kaleo action.
	*
	* @param scriptRequiredContexts the script required contexts of this kaleo action
	*/

	public void setScriptRequiredContexts(
		java.lang.String scriptRequiredContexts) {
		_kaleoAction.setScriptRequiredContexts(scriptRequiredContexts);
	}

	/**
	* Returns the priority of this kaleo action.
	*
	* @return the priority of this kaleo action
	*/

	public int getPriority() {
		return _kaleoAction.getPriority();
	}

	/**
	* Sets the priority of this kaleo action.
	*
	* @param priority the priority of this kaleo action
	*/

	public void setPriority(int priority) {
		_kaleoAction.setPriority(priority);
	}


	public boolean isNew() {
		return _kaleoAction.isNew();
	}


	public void setNew(boolean n) {
		_kaleoAction.setNew(n);
	}


	public boolean isCachedModel() {
		return _kaleoAction.isCachedModel();
	}


	public void setCachedModel(boolean cachedModel) {
		_kaleoAction.setCachedModel(cachedModel);
	}


	public boolean isEscapedModel() {
		return _kaleoAction.isEscapedModel();
	}


	public java.io.Serializable getPrimaryKeyObj() {
		return _kaleoAction.getPrimaryKeyObj();
	}


	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_kaleoAction.setPrimaryKeyObj(primaryKeyObj);
	}


	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _kaleoAction.getExpandoBridge();
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_kaleoAction.setExpandoBridgeAttributes(baseModel);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_kaleoAction.setExpandoBridgeAttributes(expandoBridge);
	}


	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_kaleoAction.setExpandoBridgeAttributes(serviceContext);
	}


	public java.lang.Object clone() {
		return new KaleoActionWrapper((KaleoAction)_kaleoAction.clone());
	}


	public int compareTo(
		com.liferay.portal.workflow.kaleo.model.KaleoAction kaleoAction) {
		return _kaleoAction.compareTo(kaleoAction);
	}


	public int hashCode() {
		return _kaleoAction.hashCode();
	}


	public com.liferay.portal.model.CacheModel<com.liferay.portal.workflow.kaleo.model.KaleoAction> toCacheModel() {
		return _kaleoAction.toCacheModel();
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoAction toEscapedModel() {
		return new KaleoActionWrapper(_kaleoAction.toEscapedModel());
	}


	public com.liferay.portal.workflow.kaleo.model.KaleoAction toUnescapedModel() {
		return new KaleoActionWrapper(_kaleoAction.toUnescapedModel());
	}


	public java.lang.String toString() {
		return _kaleoAction.toString();
	}


	public java.lang.String toXmlString() {
		return _kaleoAction.toXmlString();
	}


	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_kaleoAction.persist();
	}


	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KaleoActionWrapper)) {
			return false;
		}

		KaleoActionWrapper kaleoActionWrapper = (KaleoActionWrapper)obj;

		if (Validator.equals(_kaleoAction, kaleoActionWrapper._kaleoAction)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public KaleoAction getWrappedKaleoAction() {
		return _kaleoAction;
	}


	public KaleoAction getWrappedModel() {
		return _kaleoAction;
	}


	public void resetOriginalValues() {
		_kaleoAction.resetOriginalValues();
	}

	private KaleoAction _kaleoAction;
}