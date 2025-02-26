package net.scaffidi.otel.agentexample;
import io.opentelemetry.instrumentation.annotations.WithSpan;
import io.opentelemetry.contrib.attach.RuntimeAttach;

public final class Main {

  public static void main(String[] args) throws InterruptedException {
    RuntimeAttach.attachJavaagentToCurrentJvm();
    (new Main()).doWork();
  }

  public Main() {}

  @WithSpan
  public void doWork() throws InterruptedException {
    Thread.sleep(1000);
  }
}
