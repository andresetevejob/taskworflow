package com.pipper.andreboot.core;

public interface Mutator {
    /**
     * Creates an association between the given key
     * and the given value.
     *
     * @param aKey
     *          The key to associate with the value
     * @param aValue
     *          The value to associate with the key (can be <code>null</code>).
     */
    void set (String aKey, Object aValue);

    /**
     * Creates an association between the given key
     * and the given value ONLY if the key is not already
     * associated with a value or if the value associated
     * with the key is <code>null</code>.
     *
     * @param aKey
     *          The key to associate with the value
     * @param aValue
     *          The value to associate with the key (can be <code>null</code>).
     */
    void setIfNull (String aKey, Object aValue);
}
