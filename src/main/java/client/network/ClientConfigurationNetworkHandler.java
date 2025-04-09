package yarnwrap.client.network;
public class ClientConfigurationNetworkHandler { public net.minecraft.client.network.ClientConfigurationNetworkHandler wrapperContained; public ClientConfigurationNetworkHandler(net.minecraft.client.network.ClientConfigurationNetworkHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.mojang.authlib.GameProfile profile() { return wrapperContained.profile; }
// public Object registryManager() { return wrapperContained.registryManager; }
// public yarnwrap.resource.featuretoggle.FeatureSet enabledFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.enabledFeatures); }
// public yarnwrap.client.network.ClientRegistries clientRegistries() { return new yarnwrap.client.network.ClientRegistries(wrapperContained.clientRegistries); }
// public yarnwrap.client.resource.ClientDataPackManager dataPackManager() { return new yarnwrap.client.resource.ClientDataPackManager(wrapperContained.dataPackManager); }
// public Object chatState() { return wrapperContained.chatState; }
// public void handleCustomPayload(yarnwrap.network.packet.CustomPayload payload) { wrapperContained.handleCustomPayload(payload.wrapperContained); }
// public java.lang.Object openClientDataPack(java.util.function.Function opener) { return wrapperContained.openClientDataPack(opener); }

}