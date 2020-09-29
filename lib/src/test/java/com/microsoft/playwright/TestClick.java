/**
 * Copyright (c) Microsoft Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.playwright;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestClick {
  private static Playwright playwright;
  private Browser browser;
  private boolean isChromium;
  private BrowserContext context;
  private Page page;

  @BeforeAll
  static void beforeAll() {
    playwright = Playwright.create();
  }

  @BeforeEach
  void setUp() {
    browser = playwright.chromium().launch();
    isChromium = true;
    context = browser.newContext();
    page = context.newPage();
  }

  @AfterEach
  void tearDown() {
    browser.close();
  }

  @Test
  void version_should_work() {
//    page.navigate(server.PREFIX + "/input/button.html");
//    page.click("button");
//    assertEquals("Clicked", page.evaluate("result"));
  }
}