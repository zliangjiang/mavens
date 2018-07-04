package com.demo.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class DiscardServer {
private int port;
	
	public DiscardServer(int port) {
		super();
		this.port = port;//22498180 58908517
	}
	
	public void run() throws Exception {
		EventLoopGroup bossGroup = new NioEventLoopGroup();
		EventLoopGroup workerGroup = new NioEventLoopGroup();
		
		System.out.println("ready to run port:"+port);
		try {
			ServerBootstrap b = new ServerBootstrap();
			b.group(bossGroup, workerGroup)
			 .channel(NioServerSocketChannel.class)
			 .childHandler(new ChannelInitializer<SocketChannel>(){
				@Override
				public void initChannel(SocketChannel ch) throws Exception {
					ch.pipeline().addLast(new DiscardServerHandler());	
				}
			})
			.option(ChannelOption.SO_BACKLOG, 128)
			.childOption(ChannelOption.SO_KEEPALIVE, true);
			
			ChannelFuture f = b.bind(port).sync();
			System.out.println("Server start listen at " + port );  
			f.channel().closeFuture().sync();
		} finally {
			workerGroup.shutdownGracefully();
			bossGroup.shutdownGracefully();
		}
	}
	
	public static void main(String[] args) throws Exception {
		int port;
		if (args.length >0) {
			port = Integer.parseInt(args[0]);
		} else {
			port = 8880;
		}
		new DiscardServer(port).run();
		System.out.println("server:run()");
	}
}
