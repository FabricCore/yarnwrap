package yarnwrap.client.network;
public class AllowedAddressResolver { public net.minecraft.client.network.AllowedAddressResolver wrapperContained; public AllowedAddressResolver(net.minecraft.client.network.AllowedAddressResolver wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.network.AllowedAddressResolver DEFAULT() { return new yarnwrap.client.network.AllowedAddressResolver(wrapperContained.DEFAULT); }
// public yarnwrap.client.network.AddressResolver addressResolver() { return new yarnwrap.client.network.AddressResolver(wrapperContained.addressResolver); }
// public yarnwrap.client.network.RedirectResolver redirectResolver() { return new yarnwrap.client.network.RedirectResolver(wrapperContained.redirectResolver); }
// public yarnwrap.client.network.BlockListChecker blockListChecker() { return new yarnwrap.client.network.BlockListChecker(wrapperContained.blockListChecker); }
public java.util.Optional resolve(yarnwrap.client.network.ServerAddress address) { return wrapperContained.resolve(address.wrapperContained); }

}