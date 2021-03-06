/*
 * This file is part of the GeoLatte project.
 *
 *     GeoLatte is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     GeoLatte is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with GeoLatte.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2010 - 2010 and Ownership of code is shared by:
 * Qmino bvba - Romeinsestraat 18 - 3001 Heverlee  (http://www.qmino.com)
 * Geovise bvba - Generaal Eisenhowerlei 9 - 2140 Antwerpen (http://www.geovise.com)
 */

package org.geolatte.common.dataformats.json.jackson;

/**
* No comment provided yet for this class.
* <p/>
* <p>
* <i>Creation-Date</i>: 21-apr-2010<br>
* <i>Creation-Time</i>: 15:05:19<br>
* </p>
*
* @author Yves Vandewoude
* @author <a href="http://www.qmino.com">Qmino bvba</a>
* @since SDK1.5
*/
public class RecursionTestA
{
    public RecursionTestA(RecursionTestB b, String name)
    {
        this.b = b;
        this.name = name;
    }
    public RecursionTestB getB() {
        return b;
    }

    public String getName() {
        return name;
    }

    private RecursionTestB b;
    private String name;

}
