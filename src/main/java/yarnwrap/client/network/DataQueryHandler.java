package yarnwrap.client.network;
public class DataQueryHandler { public net.minecraft.client.network.DataQueryHandler wrapperContained; public DataQueryHandler(net.minecraft.client.network.DataQueryHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value) { wrapperContained.networkHandler = value.wrapperContained; }
// public static yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(net.minecraft.client.network.DataQueryHandler.networkHandler); }
// public static void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value, ) { net.minecraft.client.network.DataQueryHandler.networkHandler = value.wrapperContained; }

// public int expectedTransactionId() { return wrapperContained.expectedTransactionId; }
// public void expectedTransactionId(int value) { wrapperContained.expectedTransactionId = value; }
// public static int expectedTransactionId() { return net.minecraft.client.network.DataQueryHandler.expectedTransactionId; }
// public static void expectedTransactionId(int value, ) { net.minecraft.client.network.DataQueryHandler.expectedTransactionId = value; }

// public java.util.function.Consumer callback() { return wrapperContained.callback; }
// public void callback(java.util.function.Consumer value) { wrapperContained.callback = value; }
// public static java.util.function.Consumer callback() { return net.minecraft.client.network.DataQueryHandler.callback; }
// public static void callback(java.util.function.Consumer value, ) { net.minecraft.client.network.DataQueryHandler.callback = value; }

public DataQueryHandler(yarnwrap.client.network.ClientPlayNetworkHandler networkHandler) { this.wrapperContained = new net.minecraft.client.network.DataQueryHandler(networkHandler.wrapperContained); }
// public int nextQuery(java.util.function.Consumer callback) { return wrapperContained.nextQuery(callback); }
// public static int nextQuery(java.util.function.Consumer callback, ) { return net.minecraft.client.network.DataQueryHandler.nextQuery(callback); }
public void queryBlockNbt(yarnwrap.util.math.BlockPos pos,java.util.function.Consumer callback) { wrapperContained.queryBlockNbt(pos.wrapperContained,callback); }
// public static void queryBlockNbt(yarnwrap.util.math.BlockPos pos,java.util.function.Consumer callback, ) { net.minecraft.client.network.DataQueryHandler.queryBlockNbt(pos.wrapperContained,callback); }
public boolean handleQueryResponse(int transactionId,yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.handleQueryResponse(transactionId,nbt.wrapperContained); }
// public static boolean handleQueryResponse(int transactionId,yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.client.network.DataQueryHandler.handleQueryResponse(transactionId,nbt.wrapperContained); }
public void queryEntityNbt(int entityNetworkId,java.util.function.Consumer callback) { wrapperContained.queryEntityNbt(entityNetworkId,callback); }
// public static void queryEntityNbt(int entityNetworkId,java.util.function.Consumer callback, ) { net.minecraft.client.network.DataQueryHandler.queryEntityNbt(entityNetworkId,callback); }

}