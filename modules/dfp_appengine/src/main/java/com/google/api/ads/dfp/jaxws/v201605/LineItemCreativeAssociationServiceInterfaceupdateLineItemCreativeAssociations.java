
package com.google.api.ads.dfp.jaxws.v201605;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link LineItemCreativeAssociation} objects
 *             
 *             @param lineItemCreativeAssociations the line item creative associations to
 *             update
 *             @return the updated line item creative associations
 *           
 * 
 * <p>Java class for updateLineItemCreativeAssociations element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateLineItemCreativeAssociations">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="lineItemCreativeAssociations" type="{https://www.google.com/apis/ads/publisher/v201605}LineItemCreativeAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lineItemCreativeAssociations"
})
@XmlRootElement(name = "updateLineItemCreativeAssociations")
public class LineItemCreativeAssociationServiceInterfaceupdateLineItemCreativeAssociations {

    protected List<LineItemCreativeAssociation> lineItemCreativeAssociations;

    /**
     * Gets the value of the lineItemCreativeAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItemCreativeAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItemCreativeAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemCreativeAssociation }
     * 
     * 
     */
    public List<LineItemCreativeAssociation> getLineItemCreativeAssociations() {
        if (lineItemCreativeAssociations == null) {
            lineItemCreativeAssociations = new ArrayList<LineItemCreativeAssociation>();
        }
        return this.lineItemCreativeAssociations;
    }

}
