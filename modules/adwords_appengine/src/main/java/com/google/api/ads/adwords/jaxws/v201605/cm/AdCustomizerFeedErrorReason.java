
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdCustomizerFeedError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdCustomizerFeedError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_ADD_KEY_ATTRIBUTE"/>
 *     &lt;enumeration value="NOT_AD_CUSTOMIZER_FEED"/>
 *     &lt;enumeration value="INVALID_FEED_NAME"/>
 *     &lt;enumeration value="TOO_MANY_FEED_ATTRIBUTES_FOR_FEED"/>
 *     &lt;enumeration value="ATTRIBUTE_NAMES_NOT_UNIQUE"/>
 *     &lt;enumeration value="FEED_DELETED"/>
 *     &lt;enumeration value="DUPLICATE_FEED_NAME"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdCustomizerFeedError.Reason")
@XmlEnum
public enum AdCustomizerFeedErrorReason {


    /**
     * 
     *                 The key attribute cannot be added to an existing ad customizer feed.
     *               
     * 
     */
    CANNOT_ADD_KEY_ATTRIBUTE,

    /**
     * 
     *                 The feed is not an ad customizer feed.
     *               
     * 
     */
    NOT_AD_CUSTOMIZER_FEED,

    /**
     * 
     *                 Name of AdCustomizerFeed is not allowed.
     *               
     * 
     */
    INVALID_FEED_NAME,

    /**
     * 
     *                 Too many AdCustomizerFeedAttributes for an AdCustomizerFeed.
     *               
     * 
     */
    TOO_MANY_FEED_ATTRIBUTES_FOR_FEED,

    /**
     * 
     *                 The names of the AdCustomizerFeedAttributes must be unique.
     *               
     * 
     */
    ATTRIBUTE_NAMES_NOT_UNIQUE,

    /**
     * 
     *                 The given id refers to a removed Feed. Removed Feeds are immutable.
     *               
     * 
     */
    FEED_DELETED,

    /**
     * 
     *                 Feed name matches that of another active Feed.
     *               
     * 
     */
    DUPLICATE_FEED_NAME,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdCustomizerFeedErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
