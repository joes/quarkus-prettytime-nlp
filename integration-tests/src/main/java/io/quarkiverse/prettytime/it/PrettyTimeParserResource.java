/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package io.quarkiverse.prettytime.it;

import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import org.ocpsoft.prettytime.nlp.PrettyTimeParser;

@Path("/prettyTimeParser")
@ApplicationScoped
public class PrettyTimeParserResource {
    @Inject
    PrettyTimeParser prettyTimeParser;

    @GET
    public String hello() {
        Date parse = prettyTimeParser.parse("today").get(0);
        return new SimpleDateFormat("yyyy-MM-dd").format(parse);
    }
}
