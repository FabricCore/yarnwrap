package yarnwrap.client.realms;
public class RealmsAvailability { public net.minecraft.client.realms.RealmsAvailability wrapperContained; public RealmsAvailability(net.minecraft.client.realms.RealmsAvailability wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.concurrent.CompletableFuture currentFuture() { return wrapperContained.currentFuture; }
// public void currentFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.currentFuture = value; }
public java.util.concurrent.CompletableFuture check() { return wrapperContained.check(); }
// public boolean wasUnsuccessful(java.util.concurrent.CompletableFuture future) { return wrapperContained.wasUnsuccessful(future); }
// public java.util.concurrent.CompletableFuture checkInternal() { return wrapperContained.checkInternal(); }

}