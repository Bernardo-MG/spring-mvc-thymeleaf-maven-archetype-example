/**
 * The MIT License (MIT)
 * <p>
 * Copyright (c) 2023 the original author or authors.
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.bernardomg.example.spring_mvc_thymeleaf_maven_archetype_example.error.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for error views.
 *
 * @author Bernardo Mart&iacute;nez Garrido
 */
@Controller
public class CustomErrorController implements ErrorController  {

    /**
     * Name for the 404 error view.
     */
    private static final String VIEW_404   = "404";

    /**
     * Name for the generic error view.
     */
    private static final String VIEW_ERROR = "error";

    /**
     * Default constructor.
     */
    public CustomErrorController() {
        super();
    }

    /**
     * Shows the 404 error view.
     *
     * @return the 404 error view
     */
    @RequestMapping("/404")
    public String show404() {
        return VIEW_404;
    }

    /**
     * Shows the generic error view.
     *
     * @return the generic error view
     */
    @RequestMapping("/error")
    public String showError() {
        return VIEW_ERROR;
    }

}
