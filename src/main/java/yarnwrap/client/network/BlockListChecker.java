package yarnwrap.client.network;
public class BlockListChecker { public net.minecraft.client.network.BlockListChecker wrapperContained; public BlockListChecker(net.minecraft.client.network.BlockListChecker wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.BlockListChecker create() { return new yarnwrap.client.network.BlockListChecker(wrapperContained.create()); }
public static yarnwrap.client.network.BlockListChecker create() { return new yarnwrap.client.network.BlockListChecker(net.minecraft.client.network.BlockListChecker.create()); }
public boolean isAllowed(yarnwrap.client.network.Address address) { return wrapperContained.isAllowed(address.wrapperContained); }
// public static boolean isAllowed(yarnwrap.client.network.Address address, ) { return net.minecraft.client.network.BlockListChecker.isAllowed(address.wrapperContained); }
public boolean isAllowed(yarnwrap.client.network.ServerAddress address) { return wrapperContained.isAllowed(address.wrapperContained); }
// public static boolean isAllowed(yarnwrap.client.network.ServerAddress address, ) { return net.minecraft.client.network.BlockListChecker.isAllowed(address.wrapperContained); }

}