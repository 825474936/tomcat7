/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.tomcat.util.http.parser;

/**
 * Represents a parameter as per section 3.6 of RFC 2616. Originally generated
 * by <a href="http://javacc.java.net/doc/JJTree.html"> JJTree</a>.
 */
public class AstParameter extends SimpleNode {
    public AstParameter(int id) {
        super(id);
    }

    public AstParameter(HttpParser p, int id) {
        super(p, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(children[0].toString());
        sb.append("=");
        sb.append(children[1].toString());
        return sb.toString();
    }
}
