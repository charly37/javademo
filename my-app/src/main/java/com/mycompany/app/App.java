package com.mycompany.app;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        KubernetesClient client = new KubernetesClientBuilder().build();
        try (KubernetesClient kc = new KubernetesClientBuilder().build()) {
  kc.pods().inNamespace("seco1-admin").list().getItems()
    .forEach(pod -> 
      System.out.printf("Pod %s %n", pod.getMetadata().getName()));
      Thread.sleep(7000);
}
catch(InterruptedException ex)
      {
          ex.printStackTrace();
      }
   
    }
}
