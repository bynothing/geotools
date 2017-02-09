/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 * 
 *    (C) 2017, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.util;

import java.awt.Color;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.geotools.factory.Hints;
import org.geotools.util.Converter;
import org.geotools.util.ConverterFactory;

/**
 * 
 * Converts CSS Color Module 4 names to {@link Color} objects.
 * 
 * @see <a href="https://www.w3.org/TR/css-color-4/#named-colors">https://www.w3.org/TR/css-color-4/#named-colors</a> 
 *
 */
public class CssColorConverter implements Converter {

    private static final Map<String, Color> CSS_COLORS;

    static {
        HashMap<String, Color> colors = new HashMap<>();
        colors.put("aliceblue", new Color(240, 248, 255));
        colors.put("antiquewhite", new Color(250, 235, 215));
        colors.put("aqua", new Color(0, 255, 255));
        colors.put("aquamarine", new Color(127, 255, 212));
        colors.put("azure", new Color(240, 255, 255));
        colors.put("beige", new Color(245, 245, 220));
        colors.put("bisque", new Color(255, 228, 196));
        colors.put("black", new Color(0, 0, 0));
        colors.put("blanchedalmond", new Color(255, 235, 205));
        colors.put("blue", new Color(0, 0, 255));
        colors.put("blueviolet", new Color(138, 43, 226));
        colors.put("brown", new Color(165, 42, 42));
        colors.put("burlywood", new Color(222, 184, 135));
        colors.put("cadetblue", new Color(95, 158, 160));
        colors.put("chartreuse", new Color(127, 255, 0));
        colors.put("chocolate", new Color(210, 105, 30));
        colors.put("coral", new Color(255, 127, 80));
        colors.put("cornflowerblue", new Color(100, 149, 237));
        colors.put("cornsilk", new Color(255, 248, 220));
        colors.put("crimson", new Color(220, 20, 60));
        colors.put("cyan", new Color(0, 255, 255));
        colors.put("darkblue", new Color(0, 0, 139));
        colors.put("darkcyan", new Color(0, 139, 139));
        colors.put("darkgoldenrod", new Color(184, 134, 11));
        colors.put("darkgray", new Color(169, 169, 169));
        colors.put("darkgreen", new Color(0, 100, 0));
        colors.put("darkgrey", new Color(169, 169, 169));
        colors.put("darkkhaki", new Color(189, 183, 107));
        colors.put("darkmagenta", new Color(139, 0, 139));
        colors.put("darkolivegreen", new Color(85, 107, 47));
        colors.put("darkorange", new Color(255, 140, 0));
        colors.put("darkorchid", new Color(153, 50, 204));
        colors.put("darkred", new Color(139, 0, 0));
        colors.put("darksalmon", new Color(233, 150, 122));
        colors.put("darkseagreen", new Color(143, 188, 143));
        colors.put("darkslateblue", new Color(72, 61, 139));
        colors.put("darkslategray", new Color(47, 79, 79));
        colors.put("darkslategrey", new Color(47, 79, 79));
        colors.put("darkturquoise", new Color(0, 206, 209));
        colors.put("darkviolet", new Color(148, 0, 211));
        colors.put("deeppink", new Color(255, 20, 147));
        colors.put("deepskyblue", new Color(0, 191, 255));
        colors.put("dimgray", new Color(105, 105, 105));
        colors.put("dimgrey", new Color(105, 105, 105));
        colors.put("dodgerblue", new Color(30, 144, 255));
        colors.put("firebrick", new Color(178, 34, 34));
        colors.put("floralwhite", new Color(255, 250, 240));
        colors.put("forestgreen", new Color(34, 139, 34));
        colors.put("fuchsia", new Color(255, 0, 255));
        colors.put("gainsboro", new Color(220, 220, 220));
        colors.put("ghostwhite", new Color(248, 248, 255));
        colors.put("gold", new Color(255, 215, 0));
        colors.put("goldenrod", new Color(218, 165, 32));
        colors.put("gray", new Color(128, 128, 128));
        colors.put("green", new Color(0, 128, 0));
        colors.put("greenyellow", new Color(173, 255, 47));
        colors.put("grey", new Color(128, 128, 128));
        colors.put("honeydew", new Color(240, 255, 240));
        colors.put("hotpink", new Color(255, 105, 180));
        colors.put("indianred", new Color(205, 92, 92));
        colors.put("indigo", new Color(75, 0, 130));
        colors.put("ivory", new Color(255, 255, 240));
        colors.put("khaki", new Color(240, 230, 140));
        colors.put("lavender", new Color(230, 230, 250));
        colors.put("lavenderblush", new Color(255, 240, 245));
        colors.put("lawngreen", new Color(124, 252, 0));
        colors.put("lemonchiffon", new Color(255, 250, 205));
        colors.put("lightblue", new Color(173, 216, 230));
        colors.put("lightcoral", new Color(240, 128, 128));
        colors.put("lightcyan", new Color(224, 255, 255));
        colors.put("lightgoldenrodyellow", new Color(250, 250, 210));
        colors.put("lightgray", new Color(211, 211, 211));
        colors.put("lightgreen", new Color(144, 238, 144));
        colors.put("lightgrey", new Color(211, 211, 211));
        colors.put("lightpink", new Color(255, 182, 193));
        colors.put("lightsalmon", new Color(255, 160, 122));
        colors.put("lightseagreen", new Color(32, 178, 170));
        colors.put("lightskyblue", new Color(135, 206, 250));
        colors.put("lightslategray", new Color(119, 136, 153));
        colors.put("lightslategrey", new Color(119, 136, 153));
        colors.put("lightsteelblue", new Color(176, 196, 222));
        colors.put("lightyellow", new Color(255, 255, 224));
        colors.put("lime", new Color(0, 255, 0));
        colors.put("limegreen", new Color(50, 205, 50));
        colors.put("linen", new Color(250, 240, 230));
        colors.put("magenta", new Color(255, 0, 255));
        colors.put("maroon", new Color(128, 0, 0));
        colors.put("mediumaquamarine", new Color(102, 205, 170));
        colors.put("mediumblue", new Color(0, 0, 205));
        colors.put("mediumorchid", new Color(186, 85, 211));
        colors.put("mediumpurple", new Color(147, 112, 219));
        colors.put("mediumseagreen", new Color(60, 179, 113));
        colors.put("mediumslateblue", new Color(123, 104, 238));
        colors.put("mediumspringgreen", new Color(0, 250, 154));
        colors.put("mediumturquoise", new Color(72, 209, 204));
        colors.put("mediumvioletred", new Color(199, 21, 133));
        colors.put("midnightblue", new Color(25, 25, 112));
        colors.put("mintcream", new Color(245, 255, 250));
        colors.put("mistyrose", new Color(255, 228, 225));
        colors.put("moccasin", new Color(255, 228, 181));
        colors.put("navajowhite", new Color(255, 222, 173));
        colors.put("navy", new Color(0, 0, 128));
        colors.put("oldlace", new Color(253, 245, 230));
        colors.put("olive", new Color(128, 128, 0));
        colors.put("olivedrab", new Color(107, 142, 35));
        colors.put("orange", new Color(255, 165, 0));
        colors.put("orangered", new Color(255, 69, 0));
        colors.put("orchid", new Color(218, 112, 214));
        colors.put("palegoldenrod", new Color(238, 232, 170));
        colors.put("palegreen", new Color(152, 251, 152));
        colors.put("paleturquoise", new Color(175, 238, 238));
        colors.put("palevioletred", new Color(219, 112, 147));
        colors.put("papayawhip", new Color(255, 239, 213));
        colors.put("peachpuff", new Color(255, 218, 185));
        colors.put("peru", new Color(205, 133, 63));
        colors.put("pink", new Color(255, 192, 203));
        colors.put("plum", new Color(221, 160, 221));
        colors.put("powderblue", new Color(176, 224, 230));
        colors.put("purple", new Color(128, 0, 128));
        colors.put("rebeccapurple", new Color(102, 51, 153));
        colors.put("red", new Color(255, 0, 0));
        colors.put("rosybrown", new Color(188, 143, 143));
        colors.put("royalblue", new Color(65, 105, 225));
        colors.put("saddlebrown", new Color(139, 69, 19));
        colors.put("salmon", new Color(250, 128, 114));
        colors.put("sandybrown", new Color(244, 164, 96));
        colors.put("seagreen", new Color(46, 139, 87));
        colors.put("seashell", new Color(255, 245, 238));
        colors.put("sienna", new Color(160, 82, 45));
        colors.put("silver", new Color(192, 192, 192));
        colors.put("skyblue", new Color(135, 206, 235));
        colors.put("slateblue", new Color(106, 90, 205));
        colors.put("slategray", new Color(112, 128, 144));
        colors.put("slategrey", new Color(112, 128, 144));
        colors.put("snow", new Color(255, 250, 250));
        colors.put("springgreen", new Color(0, 255, 127));
        colors.put("steelblue", new Color(70, 130, 180));
        colors.put("tan", new Color(210, 180, 140));
        colors.put("teal", new Color(0, 128, 128));
        colors.put("thistle", new Color(216, 191, 216));
        colors.put("tomato", new Color(255, 99, 71));
        colors.put("turquoise", new Color(64, 224, 208));
        colors.put("violet", new Color(238, 130, 238));
        colors.put("wheat", new Color(245, 222, 179));
        colors.put("white", new Color(255, 255, 255));
        colors.put("whitesmoke", new Color(245, 245, 245));
        colors.put("yellow", new Color(255, 255, 0));
        colors.put("yellowgreen", new Color(154, 205, 50));
        CSS_COLORS = Collections.unmodifiableMap(colors);
    }

    @Override
    public <T> T convert(Object source, Class<T> target) throws Exception {
        String name = (String) source;
        String key = name.toLowerCase().trim();
        if (CSS_COLORS.containsKey(key)) {
            return target.cast(CSS_COLORS.get(key));
        }
        return null; // not defined
    }

}