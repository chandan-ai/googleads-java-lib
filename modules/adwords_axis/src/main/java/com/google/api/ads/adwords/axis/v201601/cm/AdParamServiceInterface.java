/**
 * AdParamServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.cm;

public interface AdParamServiceInterface extends java.rmi.Remote {

    /**
     * Returns the ad parameters that match the criteria specified
     * in the
     *         selector.
     *         
     *         
     * @param serviceSelector Specifies which ad parameters to return.
     *         
     * @return A list of ad parameters.
     */
    public com.google.api.ads.adwords.axis.v201601.cm.AdParamPage get(com.google.api.ads.adwords.axis.v201601.cm.Selector serviceSelector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201601.cm.ApiException;

    /**
     * Sets and removes ad parameters.
     *         <p class="note"><b>Note:</b> {@code ADD} is not supported.
     * Use {@code SET}
     *         for new ad parameters.</p>
     *         
     *         <ul class="nolist">
     *         <li>{@code SET}: Creates or updates an ad parameter, setting
     * the new
     *         parameterized value for the given ad group / keyword pair.
     * <li>{@code REMOVE}: Removes an ad parameter. The <code><var>default-value</var>
     * </code> specified in the ad text will be used.</li>
     *         </ul>
     *         
     *         
     * @param operations The operations to perform.
     *         
     * @return A list of ad parameters, where each entry in the list is the
     * result of applying the operation in the input list with the same index.
     * For a {@code SET} operation, the returned ad parameter will contain
     * the
     *         updated values. For a {@code REMOVE} operation, the returned
     * ad parameter
     *         will simply be the ad parameter that was removed.
     */
    public com.google.api.ads.adwords.axis.v201601.cm.AdParam[] mutate(com.google.api.ads.adwords.axis.v201601.cm.AdParamOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201601.cm.ApiException;
}
