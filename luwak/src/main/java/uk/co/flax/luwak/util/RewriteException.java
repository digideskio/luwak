package uk.co.flax.luwak.util;

/*
 *   Copyright (c) 2016 Lemur Consulting Ltd.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

import org.apache.lucene.search.Query;

/**
 * Exception thrown by {@link SpanRewriter} if a query cannot be rewritten
 */
public class RewriteException extends Exception {

    public final Query cause;

    public RewriteException(String message, Query cause) {
        super(message);
        this.cause = cause;
    }
}
