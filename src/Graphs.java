import java.util.ArrayList;
import java.util.List;

public class Graphs {


    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    // Given a 2D grid [grid] where '1' represents land and '0' represents water, count and return the number of islands.
    //
    // An island is formed by connecting adjacent lands horizontally or vertically and is surrounded by water.
    // You may assume water is surrounding the grid (i.e., all the edges are water).

    public int numIslands(char[][] grid) {

        return 0;
    }


    // Check website for instructions (Too long).
    // Question: Clone Graph

    public Node cloneGraph(Node node) {

        return node;
    }


    // You are given a rectangular island heights where heights[r][c]
    // represents the height above sea level of the cell at coordinate (r, c).

    // The islands borders the Pacific Ocean from the top and left sides,
    // and borders the Atlantic Ocean from the bottom and right sides.

    // Water can flow in four directions (up, down, left, or right) from a cell to a
    // neighboring cell with height equal or lower. Water can also flow into the ocean from cells adjacent to the ocean.

    // Find all cells where water can flow from that cell to both the Pacific and Atlantic oceans.
    // Return it as a 2D list where each element is a list [r, c] representing the row and column of the cell.
    // You may return the answer in any order.


    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        return List.of();
    }


    // You are given an array prerequisites where prerequisites[i] = [a, b] indicates that you
    // must take course b first if you want to take course a.

    // The pair [0, 1], indicates that must take course 1 before taking course 0.

    // There are a total of numCourses courses you are required to take,
    // labeled from 0 to numCourses - 1.

    // Return true if it is possible to finish all courses, otherwise return false.

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        return false;
    }


    // Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each edge is a pair of nodes),
    // write a function to check whether these edges make up a valid tree.


    public boolean validTree(int n, int[][] edges) {

        return false;
    }


    // There is an undirected graph with n nodes. There is also an edges array, where edges[i] = [a, b]
    // means that there is an edge between node a and node b in the graph.

    // The nodes are numbered from 0 to n - 1.

    // Return the total number of connected components in that graph.

    public int countComponents(int n, int[][] edges) {

        return n;
    }







}
