/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.spockframework.runtime.condition;

import java.util.*;

import org.spockframework.runtime.GroovyRuntimeUtil;

public class LineBuilder {
  private final List<String> lines = new ArrayList<String>();

  public void addLine(Object object) {
    lines.add(GroovyRuntimeUtil.toString(object));
  }

  public void sort() {
    Collections.sort(lines);
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();

    for (String line : lines) {
      builder.append(line);
      builder.append("\n");
    }

    return builder.toString();
  }
}
