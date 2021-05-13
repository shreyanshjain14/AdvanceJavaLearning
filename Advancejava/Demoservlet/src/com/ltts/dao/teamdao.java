package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configure.MyConnection;

import com.ltts.model.team;

public class teamdao {
	
	public boolean insertteam(team t) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into _team values(?,?,?,?)");
		ps.setInt(1, t.getTeam_id());
		ps.setString(2, t.getTeam_name());
		ps.setString(3, t.getOwnerName());
		ps.setString(4, t.getCoachName());

		return ps.execute();
		//return false;

		
	}
	public List<team> getAllTeam() throws Exception{
		List<team> li=new ArrayList<team>();
		MyConnection c=new MyConnection();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from _team");
		ResultSet rs=ps.executeQuery();
		//Player p=new Player();
		while(rs.next()) {
			li.add(new team(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		}
		return li;
		
	}
	public team getAllTeamById(int id) throws Exception
	{
		team t=new team();
		List<team> li=new ArrayList<team>();
		li=getAllTeam();
		
		for(team p1:li)
		{
			if(p1.getTeam_id()==id)
			{
				t.setTeam_id(id);
				t.setTeam_name(p1.getTeam_name());
				t.setOwnerName(p1.getOwnerName());
				t.setCoachName(p1.getCoachName());
			}
		}
		return t;
	}
	public Boolean updateteam(int id,String tname,String oname,String cname) throws Exception
	{
		MyConnection c=new MyConnection();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("UPDATE _team SET teamname=?,ownername=?,coachname=? where id=?");
		ps.setString(1,tname);
		ps.setString(2, oname);
		ps.setString(3, cname);
		ps.setInt(4,id);
		Boolean b=ps.execute();
		return b;
	}
}
