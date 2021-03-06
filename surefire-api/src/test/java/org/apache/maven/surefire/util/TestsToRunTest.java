package org.apache.maven.surefire.util;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.Arrays;

import junit.framework.TestCase;

/*
 * @author Kristian Rosenvold
 */

public class TestsToRunTest
    extends TestCase
{
    public void testGetTestSets()
        throws Exception
    {
        TestsToRun testsToRun = new TestsToRun( Arrays.asList( new Class[]{ T1.class, T2.class } ) );
        assertEquals( 2, testsToRun.size() );
        Class[] stringJUnitCoreTestSetMap = testsToRun.getLocatedClasses();
        assertEquals( stringJUnitCoreTestSetMap[0], T1.class );
        assertEquals( stringJUnitCoreTestSetMap[1], T2.class );
        assertEquals( 2, stringJUnitCoreTestSetMap.length );
    }

    class T1
    {

    }

    class T2
    {

    }
}
