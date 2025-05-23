package yarnwrap.client.data;
public class ItemModelOutput { public net.minecraft.client.data.ItemModelOutput wrapperContained; public ItemModelOutput(net.minecraft.client.data.ItemModelOutput wrapperContained) { this.wrapperContained = wrapperContained; }

public void acceptAlias(yarnwrap.item.Item base,yarnwrap.item.Item alias) { wrapperContained.acceptAlias(base.wrapperContained,alias.wrapperContained); }
// public static void acceptAlias(yarnwrap.item.Item base,yarnwrap.item.Item alias, ) { net.minecraft.client.data.ItemModelOutput.acceptAlias(base.wrapperContained,alias.wrapperContained); }
// public void accept(yarnwrap.item.Item item,Object model) { wrapperContained.accept(item.wrapperContained,model); }
// public static void accept(yarnwrap.item.Item item,Object model, ) { net.minecraft.client.data.ItemModelOutput.accept(item.wrapperContained,model); }

}