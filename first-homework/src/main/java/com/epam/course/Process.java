package com.webratio.webapp;

public class Process implements java.io.Serializable {
    /** Serial version identifier. */
    private static final long serialVersionUID = 1L;

    private java.lang.Integer _oid;

    private java.lang.String _code;

    private java.lang.String _name;

    private java.lang.String _defaultInstanceName;

    private java.lang.String _description;

    private java.sql.Clob _descriptionCLOB;

    private java.lang.String _uuid;

    private java.lang.String _version;

    private java.util.Set _processInstances = new java.util.HashSet();

    private java.util.Set _activityTypes = new java.util.HashSet();

    private java.util.Set _parameterTypes = new java.util.HashSet();

    private float _searchScore;

    public java.lang.Integer getOid() {
        return _oid;
    }

    public void setOid(java.lang.Integer _oid) {
        this._oid = _oid;
    }

    public java.lang.String getCode() {
        return _code;
    }

    public void setCode(java.lang.String _code) {
        this._code = _code;
    }

    public java.lang.String getName() {
        return _name;
    }

    public void setName(java.lang.String _name) {
        this._name = _name;
    }

    public java.lang.String getDefaultInstanceName() {
        return _defaultInstanceName;
    }

    public void setDefaultInstanceName(java.lang.String _defaultInstanceName) {
        this._defaultInstanceName = _defaultInstanceName;
    }

    public java.lang.String getDescription() {
        return _description;
    }

    public void setDescription(java.lang.String _description) {
        this._description = _description;
    }

    public java.sql.Clob getDescriptionCLOB() {
        return _descriptionCLOB;
    }

    public void setDescriptionCLOB(java.sql.Clob _descriptionCLOB) {
        this._descriptionCLOB = _descriptionCLOB;
    }

    public java.lang.String getUuid() {
        return _uuid;
    }

    public void setUuid(java.lang.String _uuid) {
        this._uuid = _uuid;
    }

    public java.lang.String getVersion() {
        return _version;
    }

    public void setVersion(java.lang.String _version) {
        this._version = _version;
    }

    public java.util.Set getProcessInstances() {
        return _processInstances;
    }

    public void setProcessInstances(java.util.Set _processInstances) {
        this._processInstances = _processInstances;
    }

    public java.util.Set getActivityTypes() {
        return _activityTypes;
    }

    public void setActivityTypes(java.util.Set _activityTypes) {
        this._activityTypes = _activityTypes;
    }

    public java.util.Set getParameterTypes() {
        return _parameterTypes;
    }

    public void setParameterTypes(java.util.Set _parameterTypes) {
        this._parameterTypes = _parameterTypes;
    }

    public float getSearchScore() {
        return _searchScore;
    }

    public void setSearchScore(float _searchScore) {
        this._searchScore = _searchScore;
    }

    public String toString() {
        java.lang.StringBuffer sb = new java.lang.StringBuffer();
        sb.append(super.toString());
        int n = sb.length() - 1;
        if (sb.charAt(n) == ']') {
            sb.setCharAt(n, ',');
        } else {
            sb.append('[');
        }
        if (_oid != null)
            sb.append("oid=" + _oid + ',');
        if (_code != null)
            sb.append("code=" + _code + ',');
        if (_name != null)
            sb.append("name=" + _name + ',');
        if (_defaultInstanceName != null)
            sb.append("defaultInstanceName=" + _defaultInstanceName + ',');
        if (_description != null)
            sb.append("description=" + _description + ',');
        if (_uuid != null)
            sb.append("uuid=" + _uuid + ',');
        if (_version != null)
            sb.append("version=" + _version + ',');
        n = sb.length() - 1;
        if (sb.charAt(n) == ',') {
            sb.setCharAt(n, ']');
        } else if (sb.charAt(n) == '[') {
            sb.deleteCharAt(n);
        }
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.webratio.webapp.Process)) {
            return false;
        }
        com.webratio.webapp.Process __other = (com.webratio.webapp.Process) obj;
        java.lang.Object key = null;
        java.lang.Object otherKey = null;
        key = this.getOid();
        otherKey = __other.getOid();
        if (key == null) {
            if (otherKey != null) {
                return false;
            }
        } else {
            if (otherKey == null) {
                return false;
            } else if (!key.equals(otherKey)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = 0;
        java.lang.Object key = null;
        key = this.getOid();
        if (key != null) {
            hashCode |= key.hashCode();
        }
        return hashCode;
    }
}
