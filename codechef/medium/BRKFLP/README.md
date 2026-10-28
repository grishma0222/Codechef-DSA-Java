# BRKFLP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Breaks and Flips

 *As always, Hyder seeks Order in Chaos. Help him find order in the Chaotic Tree Queries!* 

You are given a tree with $N$ vertices, numbered from $1$ to $N$. Every vertex is colored either black or white.

Initially, every vertex is considered  *unmarked*.

You have to process $Q$ updates and queries, of three types:

- 1 u v: Remove the edge between vertices $u$ and $v$. It is guaranteed that this edge still exists. This update will occur exactly $N-1$ times. Vertices $u$ and $v$ become marked (if they were not already).
- 2: Flip the color of every marked vertex: black vertices become white and white vertices become black. Vertices that have not been marked yet keep their colors.
- 3: Report the number of good vertices in the current forest. A vertex is good if the connected component containing it has an odd number of black vertices.

Output the answer to every query of type $3$.

### Input Format
- The first line of input contains a single integer $T$, the number of test cases.
- Each test case consists of multiple lines of input. The first line of each test case contains two integers $N$ and $Q$, the number of vertices and the number of queries. The second line contains a string $S$ of length $N$. The $i$-th character of $S$ is B if vertex $i$ is initially black, and W if it is initially white. The next $N-1$ lines each contain two integers $u$ and $v$, describing an edge of the tree between vertices $u$ and $v$. The next $Q$ lines each describe one query, in one of the formats 1 u v, 2 or 3.
### Output Format

For each query of type $3$, output on a new line a single integer: the number of good vertices at that moment.

### Constraints
- $1 \le T \le 3 \cdot 10^4$
- $2 \le N \le 2 \cdot 10^5$
- $N - 1 \le Q \le 4 \cdot 10^5$
- $S$ consists only of the characters B and W.
- $1 \le u, v \le N$
- The given edges form a tree.
- Every edge removed by a query of type $1$ still exists at that moment, and exactly $N-1$ queries are of type $1$.
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$.
- The sum of $Q$ over all test cases does not exceed $4 \cdot 10^5$.
### Sample 1:
Input
Output

```
4
2 6
WB
1 2
3
2
3
1 1 2
2
3
3 8
BWB
1 2
2 3
3
1 1 2
3
2
3
1 2 3
2
3
5 10
BBWBW
1 2
2 3
3 4
3 5
2
3
1 2 3
2
3
1 3 5
3
1 1 2
1 3 4
3
4 5
WBBW
2 1
3 1
4 3
3
1 3 4
2
1 3 1
1 2 1

```

```
2
2
1
0
3
0
1
5
2
2
3
0
```

### Explanation:

 **Test case $1$:**  Vertex $1$ is white and vertex $2$ is black, and they form a single component with exactly one black vertex. So both vertices are good, and the answer to the first type $3$ query is $2$.

The first type $2$ query changes nothing, because no vertex has been marked yet, so the answer is still $2$.

Next, the edge between vertices $1$ and $2$ is removed, which marks both of them. The following type $2$ query flips them both: vertex $1$ becomes black and vertex $2$ becomes white. Now vertex $1$ is alone in a component with one black vertex, while vertex $2$ is alone in a component with none. So only vertex $1$ is good, and the answer is $1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T17:00:10.862Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BRKFLP)