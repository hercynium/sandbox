package net.scaffidi.otel.agentexample;
import io.opentelemetry.instrumentation.annotations.WithSpan;

public final class Main {

  public static void main(String[] args) throws InterruptedException {
    (new Main()).doWork();
  }

  public Main() {}

  @WithSpan
  public void doWork() throws InterruptedException {
    Thread.sleep(1000);
  }
}
