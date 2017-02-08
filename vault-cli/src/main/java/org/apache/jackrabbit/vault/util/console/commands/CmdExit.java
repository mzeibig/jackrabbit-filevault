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
package org.apache.jackrabbit.vault.util.console.commands;

import org.apache.commons.cli2.CommandLine;
import org.apache.commons.cli2.builder.CommandBuilder;
import org.apache.commons.cli2.option.Command;
import org.apache.jackrabbit.vault.util.console.ConsoleExecutionContext;

/**
 * {@code CmdExit}...
 */
public class CmdExit extends AbstractConsoleCommand {

    protected void doExecute(ConsoleExecutionContext ctx, CommandLine cl) throws Exception {
        ctx.getConsole().quit();
    }

    public String getShortDescription() {
        return "quit the console";
    }

    protected Command createCommand() {
        return new CommandBuilder()
                .withName("exit")
                .withName("quit")
                .withDescription(getShortDescription())
                .create();
    }
}