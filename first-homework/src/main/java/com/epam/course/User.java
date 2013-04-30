package com.webratio.webapp;

public class User implements java.io.Serializable {
    /** Serial version identifier. */
    private static final long serialVersionUID = 1L;

    private java.lang.Integer _oid;

    private java.lang.String _userName;

    private java.lang.String _password;

    private java.lang.String _email;

    private java.lang.String _group;

    private java.util.Set _groups = new java.util.HashSet();

    private com.webratio.webapp.Group _defaultGroup;

    private java.util.Set _activityInstances = new java.util.HashSet();

    private java.util.Set _candidateUserActivityInstances = new java.util.HashSet();

    private java.util.Set _notifications = new java.util.HashSet();

    private java.util.Set _userNotes = new java.util.HashSet();

    private java.util.Set _userAttachments = new java.util.HashSet();

    private java.util.Set _userToOrderItems = new java.util.HashSet();

    private float _searchScore;

    public java.lang.Integer getOid() {
        return _oid;
    }

    public void setOid(java.lang.Integer _oid) {
        this._oid = _oid;
    }

    public java.lang.String getUserName() {
        return _userName;
    }

    public void setUserName(java.lang.String _userName) {
        this._userName = _userName;
    }

    public java.lang.String getPassword() {
        return _password;
    }

    public void setPassword(java.lang.String _password) {
        this._password = _password;
    }

    public java.lang.String getEmail() {
        return _email;
    }

    public void setEmail(java.lang.String _email) {
        this._email = _email;
    }

    public java.lang.String getGroup() {
        if (_group != null) {
            return _group;
        }
        java.lang.Object User2DefaultGroupObject = this.getDefaultGroup();
        if (User2DefaultGroupObject != null) {
            com.webratio.webapp.Group User2DefaultGroup = User2DefaultGroupObject instanceof java.util.Set ? (((java.util.Set) User2DefaultGroupObject)
                    .isEmpty() ? null : (com.webratio.webapp.Group) ((java.util.Set) User2DefaultGroupObject).iterator().next())
                    : (com.webratio.webapp.Group) User2DefaultGroupObject;
            if (User2DefaultGroup != null) {
                return User2DefaultGroup.getGroupName();
            }
        }
        return _group;
    }

    public void setGroup(java.lang.String _group) {
        this._group = _group;
    }

    public java.util.Set getGroups() {
        return _groups;
    }

    public void setGroups(java.util.Set _groups) {
        this._groups = _groups;
    }

    public com.webratio.webapp.Group getDefaultGroup() {
        return _defaultGroup;
    }

    public void setDefaultGroup(com.webratio.webapp.Group _defaultGroup) {
        this._defaultGroup = _defaultGroup;
    }

    public java.util.Set getActivityInstances() {
        return _activityInstances;
    }

    public void setActivityInstances(java.util.Set _activityInstances) {
        this._activityInstances = _activityInstances;
    }

    public java.util.Set getCandidateUserActivityInstances() {
        return _candidateUserActivityInstances;
    }

    public void setCandidateUserActivityInstances(java.util.Set _candidateUserActivityInstances) {
        this._candidateUserActivityInstances = _candidateUserActivityInstances;
    }

    public java.util.Set getNotifications() {
        return _notifications;
    }

    public void setNotifications(java.util.Set _notifications) {
        this._notifications = _notifications;
    }

    public java.util.Set getUserNotes() {
        return _userNotes;
    }

    public void setUserNotes(java.util.Set _userNotes) {
        this._userNotes = _userNotes;
    }

    public java.util.Set getUserAttachments() {
        return _userAttachments;
    }

    public void setUserAttachments(java.util.Set _userAttachments) {
        this._userAttachments = _userAttachments;
    }

    public java.util.Set getUserToOrderItems() {
        return _userToOrderItems;
    }

    public void setUserToOrderItems(java.util.Set _userToOrderItems) {
        this._userToOrderItems = _userToOrderItems;
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
        if (_userName != null)
            sb.append("userName=" + _userName + ',');
        if (_password != null)
            sb.append("password=" + _password + ',');
        if (_email != null)
            sb.append("email=" + _email + ',');
        if (_group != null)
            sb.append("group=" + _group + ',');
        n = sb.length() - 1;
        if (sb.charAt(n) == ',') {
            sb.setCharAt(n, ']');
        } else if (sb.charAt(n) == '[') {
            sb.deleteCharAt(n);
        }
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.webratio.webapp.User)) {
            return false;
        }
        com.webratio.webapp.User __other = (com.webratio.webapp.User) obj;
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
