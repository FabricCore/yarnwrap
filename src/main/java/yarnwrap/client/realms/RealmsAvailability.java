package yarnwrap.client.realms;
public class RealmsAvailability { public net.minecraft.client.realms.RealmsAvailability wrapperContained; public RealmsAvailability(net.minecraft.client.realms.RealmsAvailability wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.RealmsAvailability.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.RealmsAvailability.LOGGER = value; }

// public java.util.concurrent.CompletableFuture currentFuture() { return wrapperContained.currentFuture; }
// public void currentFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.currentFuture = value; }
// public static java.util.concurrent.CompletableFuture currentFuture() { return net.minecraft.client.realms.RealmsAvailability.currentFuture; }
// public static void currentFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.realms.RealmsAvailability.currentFuture = value; }

// public java.util.concurrent.CompletableFuture check() { return wrapperContained.check(); }
public static java.util.concurrent.CompletableFuture check() { return net.minecraft.client.realms.RealmsAvailability.check(); }
// public boolean wasUnsuccessful(java.util.concurrent.CompletableFuture future) { return wrapperContained.wasUnsuccessful(future); }
// public static boolean wasUnsuccessful(java.util.concurrent.CompletableFuture future, ) { return net.minecraft.client.realms.RealmsAvailability.wasUnsuccessful(future); }
// public java.util.concurrent.CompletableFuture checkInternal() { return wrapperContained.checkInternal(); }
// public static java.util.concurrent.CompletableFuture checkInternal() { return net.minecraft.client.realms.RealmsAvailability.checkInternal(); }

}