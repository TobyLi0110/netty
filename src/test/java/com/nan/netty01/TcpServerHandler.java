package com.nan.netty01;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TcpServerHandler extends SimpleChannelInboundHandler<Object> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object msg)
			throws Exception {
		System.out.println("SERVER接收到消息:" + msg);
		ctx.channel()
				.writeAndFlush("yes, server is accepted you ,nice !" + msg);
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
			throws Exception {
		System.out.println("Unexpected exception from downstream.");
		ctx.close();
	}

}
