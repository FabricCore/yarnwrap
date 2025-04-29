package yarnwrap.client.network;
public class AllowedAddressResolver { public net.minecraft.client.network.AllowedAddressResolver wrapperContained; public AllowedAddressResolver(net.minecraft.client.network.AllowedAddressResolver wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.AllowedAddressResolver DEFAULT() { return new yarnwrap.client.network.AllowedAddressResolver(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.client.network.AllowedAddressResolver value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.client.network.AllowedAddressResolver DEFAULT() { return new yarnwrap.client.network.AllowedAddressResolver(net.minecraft.client.network.AllowedAddressResolver.DEFAULT); }
// public static void DEFAULT(yarnwrap.client.network.AllowedAddressResolver value, ) { net.minecraft.client.network.AllowedAddressResolver.DEFAULT = value.wrapperContained; }

// public yarnwrap.client.network.AddressResolver addressResolver() { return new yarnwrap.client.network.AddressResolver(wrapperContained.addressResolver); }
// public void addressResolver(yarnwrap.client.network.AddressResolver value) { wrapperContained.addressResolver = value.wrapperContained; }
// public static yarnwrap.client.network.AddressResolver addressResolver() { return new yarnwrap.client.network.AddressResolver(net.minecraft.client.network.AllowedAddressResolver.addressResolver); }
// public static void addressResolver(yarnwrap.client.network.AddressResolver value, ) { net.minecraft.client.network.AllowedAddressResolver.addressResolver = value.wrapperContained; }

// public yarnwrap.client.network.RedirectResolver redirectResolver() { return new yarnwrap.client.network.RedirectResolver(wrapperContained.redirectResolver); }
// public void redirectResolver(yarnwrap.client.network.RedirectResolver value) { wrapperContained.redirectResolver = value.wrapperContained; }
// public static yarnwrap.client.network.RedirectResolver redirectResolver() { return new yarnwrap.client.network.RedirectResolver(net.minecraft.client.network.AllowedAddressResolver.redirectResolver); }
// public static void redirectResolver(yarnwrap.client.network.RedirectResolver value, ) { net.minecraft.client.network.AllowedAddressResolver.redirectResolver = value.wrapperContained; }

// public yarnwrap.client.network.BlockListChecker blockListChecker() { return new yarnwrap.client.network.BlockListChecker(wrapperContained.blockListChecker); }
// public void blockListChecker(yarnwrap.client.network.BlockListChecker value) { wrapperContained.blockListChecker = value.wrapperContained; }
// public static yarnwrap.client.network.BlockListChecker blockListChecker() { return new yarnwrap.client.network.BlockListChecker(net.minecraft.client.network.AllowedAddressResolver.blockListChecker); }
// public static void blockListChecker(yarnwrap.client.network.BlockListChecker value, ) { net.minecraft.client.network.AllowedAddressResolver.blockListChecker = value.wrapperContained; }

// public AllowedAddressResolver(yarnwrap.client.network.AddressResolver addressResolver,yarnwrap.client.network.RedirectResolver redirectResolver,yarnwrap.client.network.BlockListChecker blockListChecker) { this.wrapperContained = new net.minecraft.client.network.AllowedAddressResolver(addressResolver.wrapperContained,redirectResolver.wrapperContained,blockListChecker.wrapperContained); }
public java.util.Optional resolve(yarnwrap.client.network.ServerAddress address) { return wrapperContained.resolve(address.wrapperContained); }
// public static java.util.Optional resolve(yarnwrap.client.network.ServerAddress address, ) { return net.minecraft.client.network.AllowedAddressResolver.resolve(address.wrapperContained); }

}