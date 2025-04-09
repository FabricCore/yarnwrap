package yarnwrap.item;
public class WrittenBookItem { public net.minecraft.item.WrittenBookItem wrapperContained; public WrittenBookItem(net.minecraft.item.WrittenBookItem wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean resolve(yarnwrap.item.ItemStack book,yarnwrap.server.command.ServerCommandSource commandSource,yarnwrap.entity.player.PlayerEntity player) { return wrapperContained.resolve(book.wrapperContained,commandSource.wrapperContained,player.wrapperContained); }

}