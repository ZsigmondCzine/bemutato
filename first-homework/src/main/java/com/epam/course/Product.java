package com.webratio.webapp;

public class Product implements java.io.Serializable {
    /** Serial version identifier. */
    private static final long serialVersionUID = 1L;

    private java.lang.Integer _OID;

    private java.lang.Integer _itemNumber;

    private java.lang.String _name;

    private java.lang.Integer _price;

    private java.lang.String _unit;

    private java.lang.Integer _quantity;

    private java.lang.String _description;

    private java.util.Set _productToOrderItems = new java.util.HashSet();

    private float _searchScore;

    public java.lang.Integer getOID() {
        return _OID;
    }

    public void setOID(java.lang.Integer _OID) {
        this._OID = _OID;
    }

    public java.lang.Integer getItemNumber() {
        return _itemNumber;
    }

    public void setItemNumber(java.lang.Integer _itemNumber) {
        this._itemNumber = _itemNumber;
    }

    public java.lang.String getName() {
        return _name;
    }

    public void setName(java.lang.String _name) {
        this._name = _name;
    }

    public java.lang.Integer getPrice() {
        return _price;
    }

    public void setPrice(java.lang.Integer _price) {
        this._price = _price;
    }

    public java.lang.String getUnit() {
        return _unit;
    }

    public void setUnit(java.lang.String _unit) {
        this._unit = _unit;
    }

    public java.lang.Integer getQuantity() {
        return _quantity;
    }

    public void setQuantity(java.lang.Integer _quantity) {
        this._quantity = _quantity;
    }

    public java.lang.String getDescription() {
        return _description;
    }

    public void setDescription(java.lang.String _description) {
        this._description = _description;
    }

    public java.util.Set getProductToOrderItems() {
        return _productToOrderItems;
    }

    public void setProductToOrderItems(java.util.Set _productToOrderItems) {
        this._productToOrderItems = _productToOrderItems;
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
        if (_OID != null)
            sb.append("OID=" + _OID + ',');
        if (_itemNumber != null)
            sb.append("itemNumber=" + _itemNumber + ',');
        if (_name != null)
            sb.append("name=" + _name + ',');
        if (_price != null)
            sb.append("price=" + _price + ',');
        if (_unit != null)
            sb.append("unit=" + _unit + ',');
        if (_quantity != null)
            sb.append("quantity=" + _quantity + ',');
        if (_description != null)
            sb.append("description=" + _description + ',');
        n = sb.length() - 1;
        if (sb.charAt(n) == ',') {
            sb.setCharAt(n, ']');
        } else if (sb.charAt(n) == '[') {
            sb.deleteCharAt(n);
        }
        return sb.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.webratio.webapp.Product)) {
            return false;
        }
        com.webratio.webapp.Product __other = (com.webratio.webapp.Product) obj;
        java.lang.Object key = null;
        java.lang.Object otherKey = null;
        key = this.getOID();
        otherKey = __other.getOID();
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
        key = this.getOID();
        if (key != null) {
            hashCode |= key.hashCode();
        }
        return hashCode;
    }
}
