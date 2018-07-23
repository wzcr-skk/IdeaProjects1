/**
 * Created by Administrator on 2018/7/5 0005.
 */
var solution = document.getElementById('solution');
var solutionUl = solution.children[1];
solutionUl.style.display = "none"
solution.onmouseover = function() {
    solutionUl.style.display = "block"
}
solution.onmouseout = function() {
    solutionUl.style.display = "none"
}