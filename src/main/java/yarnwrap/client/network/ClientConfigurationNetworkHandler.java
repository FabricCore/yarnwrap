package yarnwrap.client.network;
public class ClientConfigurationNetworkHandler { public net.minecraft.client.network.ClientConfigurationNetworkHandler wrapperContained; public ClientConfigurationNetworkHandler(net.minecraft.client.network.ClientConfigurationNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile; }
// public void profile(com.mojang.authlib.GameProfile value) { wrapperContained.profile = value; }
// public Object registryManager() { return wrapperContained.registryManager; }
// // public void registryManager(Object value) { wrapperContained.registryManager = value; }
// public yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.enabledFeatures); }
// public void enabledFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.enabledFeatures = value.wrapperContained; }
// public yarnwrap.client.network.ClientRegistries clientRegistries() { return new yarnwrap.client.network.ClientRegistries(wrapperContained.clientRegistries); }
// public void clientRegistries(yarnwrap.client.network.ClientRegistries value) { wrapperContained.clientRegistries = value.wrapperContained; }
// public yarnwrap.client.resource.ClientDataPackManager dataPackManager() { return new yarnwrap.client.resource.ClientDataPackManager(wrapperContained.dataPackManager); }
// public void dataPackManager(yarnwrap.client.resource.ClientDataPackManager value) { wrapperContained.dataPackManager = value.wrapperContained; }
// public Object chatState() { return wrapperContained.chatState; }
// // public void chatState(Object value) { wrapperContained.chatState = value; }
// public void handleCustomPayload(yarnwrap.network.packet.CustomPayload payload) { wrapperContained.handleCustomPayload(payload.wrapperContained); }
// public Object method_57043(yarnwrap.resource.ResourceFactory factory) { return wrapperContained.method_57043(factory.wrapperContained); }
// public java.lang.Object openClientDataPack(java.util.function.Function opener) { return wrapperContained.openClientDataPack(opener); }

}