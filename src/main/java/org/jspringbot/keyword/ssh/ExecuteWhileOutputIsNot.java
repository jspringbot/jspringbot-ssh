/*
 * Copyright (c) 2012. JSpringBot. All Rights Reserved.
 *
 * See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The JSpringBot licenses this file to You under the Apache License, Version 2.0
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

package org.jspringbot.keyword.ssh;

import org.jspringbot.KeywordInfo;
import org.springframework.stereotype.Component;

@Component
@KeywordInfo(name = "Execute While Output Is Not", description = "Execute While Output Is Not.", parameters = {"command","compare","sleep", "timeout"})
public class ExecuteWhileOutputIsNot extends AbstractSSHKeyword {

    @Override
    public Object execute(Object[] params) {
        try {
            helper.executeWhileOutputIsNot(String.valueOf(params[0]),String.valueOf(params[1]), Long.parseLong(String.valueOf(params[2])), Long.parseLong((String) params[3]));
        } catch (InterruptedException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }

        return null;
    }
}
