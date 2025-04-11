package yarnwrap.client.gui.screen.ingame;
public class CartographyTableScreen { public net.minecraft.client.gui.screen.ingame.CartographyTableScreen wrapperContained; public CartographyTableScreen(net.minecraft.client.gui.screen.ingame.CartographyTableScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier MAP_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.MAP_TEXTURE); }
// public void MAP_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.MAP_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier LOCKED_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.LOCKED_TEXTURE); }
// public void LOCKED_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.LOCKED_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier ERROR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.ERROR_TEXTURE); }
// public void ERROR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.ERROR_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier SCALED_MAP_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SCALED_MAP_TEXTURE); }
// public void SCALED_MAP_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SCALED_MAP_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier DUPLICATED_MAP_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.DUPLICATED_MAP_TEXTURE); }
// public void DUPLICATED_MAP_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.DUPLICATED_MAP_TEXTURE = value.wrapperContained; }
public CartographyTableScreen(yarnwrap.screen.CartographyTableScreenHandler handler,yarnwrap.entity.player.PlayerInventory inventory,yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.screen.ingame.CartographyTableScreen(handler.wrapperContained,inventory.wrapperContained,title.wrapperContained); }
// public void drawMap(yarnwrap.client.gui.DrawContext context,yarnwrap.component.type.MapIdComponent mapId,yarnwrap.item.map.MapState mapState,int x,int y,float scale) { wrapperContained.drawMap(context.wrapperContained,mapId.wrapperContained,mapState.wrapperContained,x,y,scale); }
// public void drawMap(yarnwrap.client.gui.DrawContext context,yarnwrap.component.type.MapIdComponent mapId,yarnwrap.item.map.MapState mapState,boolean cloneMode,boolean expandMode,boolean lockMode,boolean cannotExpand) { wrapperContained.drawMap(context.wrapperContained,mapId.wrapperContained,mapState.wrapperContained,cloneMode,expandMode,lockMode,cannotExpand); }

}