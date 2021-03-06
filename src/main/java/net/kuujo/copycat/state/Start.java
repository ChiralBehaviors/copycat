/*
 * Copyright 2014 the original author or authors.
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
package net.kuujo.copycat.state;

import net.kuujo.copycat.protocol.PingRequest;
import net.kuujo.copycat.protocol.PollRequest;
import net.kuujo.copycat.protocol.SubmitRequest;
import net.kuujo.copycat.protocol.SyncRequest;

import org.vertx.java.core.AsyncResult;
import org.vertx.java.core.Handler;
import org.vertx.java.core.impl.DefaultFutureResult;

/**
 * A start state.
 * 
 * @author Jordan Halterman
 */
class Start extends State {

  @Override
  public void startUp(Handler<AsyncResult<Void>> doneHandler) {
    new DefaultFutureResult<Void>((Void) null).setHandler(doneHandler);
  }

  @Override
  public void ping(PingRequest request) {
    request.error("Service not started.");
  }

  @Override
  public void sync(SyncRequest request) {
    request.error("Service not started.");
  }

  @Override
  public void poll(PollRequest request) {
    request.error("Service not started.");
  }

  @Override
  public void submit(SubmitRequest request) {
    request.error("Service not started.");
  }

  @Override
  public void shutDown(Handler<AsyncResult<Void>> doneHandler) {
    new DefaultFutureResult<Void>((Void) null).setHandler(doneHandler);
  }

}
