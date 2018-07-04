package com.demo.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCountUtil;

public class DiscardServerHandler extends ChannelInboundHandlerAdapter {
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		try {
			ByteBuf in = (ByteBuf) msg;
			System.out.println(in.toString(CharsetUtil.UTF_8));
			System.out.println("server channelRead..");  
	        System.out.println(ctx.channel().remoteAddress()+"->Server :"+ msg.toString());  
	        ctx.write("server write"+msg);  
	        ctx.flush();  
			
		} finally {
			ReferenceCountUtil.release(msg);
		}
	}
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		ctx.close();
	}
}
