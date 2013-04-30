package com.webratio.webapp;

public class OrderItems implements java.io.Serializable {
    /** Serial version identifier. */
    private static final long serialVersionUID = 1L;

    private java.lang.Integer _oid;

    private java.lang.Integer _qunatity;

    private java.lang.Integer _price;

    private java.lang.Integer _unigueCode;

    private com.webratio.webapp.User _orderItemsToUser;

    private com.webratio.webapp.Order _orderItemsToOrder;

    private com.webratio.webapp.Product _orderItemsToProduct;

    private float _searchScore;

    public java.lang.Integer getOid() {
        return _oid;
    }

    public void setOid(java.lang.Integer _oid) {
        this._oid = _oid;
    }

    public java.lang.Integer getQunatity() {
        return _qunatity;
    }

    public void setQunatity(java.lang.Integer _qunatity) {
        this._qunatity = _qunatity;
    }

    public java.lang.Integer getPrice() {
        return _price;
    }

    public void setPrice(java.lang.Integer _price) {
        this._price = _price;
    }

    public java.lang.Integer getUnigueCode() {
        return _unigueCode;
    }

    public void setUnigueCode(java.lang.Integer _unigueCode) {
        this._unigueCode = _unigueCode;
    }

    public com.webratio.webapp.User getOrderItemsToUser() {
        return _orderItemsToUser;
    }

    public void setOrderItemsToUser(com.webratio.webapp.User _orderItemsToUser) {
        this._orderItemsToUser = _orderItemsToUser;
    }

    public com.webratio.webapp.Order getOrderItemsToOrder() {
        return _orderItemsToOrder;
    }

    public void setOrderItemsToOrder(com.webratio.webapp.Order _orderItemsToOrder) {
        this._orderItemsToOrder = _orderItemsToOrder;
    }

    public com.webratio.webapp.Product getOrderItemsToProduct() {
        return _orderItemsToProduct;
    }

    public void setOrderItemsToProduct(com.webratio.webapp.Product _orderItemsToProduct) {
        this._orderItemsToProduct = _orderItemsToProduct;
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
        if (_qunatity != null)
            sb.append("qunatity=" + _qunatity + ',');
        if (_price != null)
            sb.append("price=" + _price + ',');
        if (_unigueCode != null)
            sb.append("unigueCode=" + _unigueCode + ',');
        n = sb.length() - 1;
        if (sb.charAt(n) == ',') {
            sb.setCharAt(n, ']');
        } else if (sb.charAt(n) == '[') {
            sb.deleteCharAt(n);
        }
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.webratio.webapp.OrderItems)) {
            return false;
        }
        com.webratio.webapp.OrderItems __other = (com.webratio.webapp.OrderItems) obj;
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
