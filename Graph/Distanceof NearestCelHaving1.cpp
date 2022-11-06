
vector<vector<int>>nearest(vector<vector<int>>grid)
	{
	     int n = grid.size(), m = grid[0].size();
	    vector<vector<int>> ans(n, vector<int>(m, 0));
	    queue<pair<int,pair<int,int>>> q;
	    for(int i=0; i<n; i++) {
	        for(int j=0; j<m; j++) {
	            if(grid[i][j]==0)
	                ans[i][j] = INT_MAX;
	            else
	                q.push({0, {i,j}});
	        }
	    }
	    int dx[] = {-1, 0, +1, 0};
	    int dy[] = {0, +1, 0, -1};
	    while(!q.empty()) {
	        int x = q.front().second.first;
	        int y = q.front().second.second;
	        int dis = q.front().first;
	        q.pop();
	        for(int i=0; i<4; i++) {
	            int newX = x+dx[i];
	            int newY = y+dy[i];
	            if(newX>=0 && newX<n && newY>=0 && newY<m && 1+dis<ans[newX][newY]) {
	                ans[newX][newY] = 1 + dis;
	                q.push({1+dis, {newX, newY}});
	            }
	        }
	    }
	    return ans;
	}