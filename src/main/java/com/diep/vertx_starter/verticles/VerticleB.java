package com.diep.vertx_starter.verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;

public class VerticleB extends AbstractVerticle {

  public static void main(String[] args) {
    var vertx = Vertx.vertx();
    // deploy main verticle will trigger its start method
    vertx.deployVerticle(new VerticleB());
  }

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("Start " + getClass().getName());
    startPromise.complete();
  }
}
