package yarnwrap.client.network;
public class DataQueryHandler { public net.minecraft.client.network.DataQueryHandler wrapperContained; public DataQueryHandler(net.minecraft.client.network.DataQueryHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value) { wrapperContained.networkHandler = value.wrapperContained; }
// public int expectedTransactionId() { return wrapperContained.expectedTransactionId; }
// public void expectedTransactionId(int value) { wrapperContained.expectedTransactionId = value; }
// public java.util.function.Consumer callback() { return wrapperContained.callback; }
// public void callback(java.util.function.Consumer value) { wrapperContained.callback = value; }
// public int nextQuery(java.util.function.Consumer callback) { return wrapperContained.nextQuery(callback); }
public void queryBlockNbt(yarnwrap.util.math.BlockPos pos,java.util.function.Consumer callback) { wrapperContained.queryBlockNbt(pos.wrapperContained,callback); }
public boolean handleQueryResponse(int transactionId,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.handleQueryResponse(transactionId,nbt.wrapperContained); }
public void queryEntityNbt(int entityNetworkId,java.util.function.Consumer callback) { wrapperContained.queryEntityNbt(entityNetworkId,callback); }

}