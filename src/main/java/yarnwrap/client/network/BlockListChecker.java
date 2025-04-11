package yarnwrap.client.network;
public class BlockListChecker { public net.minecraft.client.network.BlockListChecker wrapperContained; public BlockListChecker(net.minecraft.client.network.BlockListChecker wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.BlockListChecker create() { return new yarnwrap.client.network.BlockListChecker(wrapperContained.create()); }
public boolean isAllowed(yarnwrap.client.network.Address address) { return wrapperContained.isAllowed(address.wrapperContained); }
public boolean isAllowed(yarnwrap.client.network.ServerAddress address) { return wrapperContained.isAllowed(address.wrapperContained); }

}