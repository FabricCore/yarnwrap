package yarnwrap.client.network;
public class LanServerQueryManager { public net.minecraft.client.network.LanServerQueryManager wrapperContained; public LanServerQueryManager(net.minecraft.client.network.LanServerQueryManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.concurrent.atomic.AtomicInteger THREAD_ID() { return wrapperContained.THREAD_ID; }
// public void THREAD_ID(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.THREAD_ID = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }

}