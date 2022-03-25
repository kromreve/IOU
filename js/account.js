document.getElementById("edit-btn").onclick = function () {
    if (document.getElementById("inp").hasAttribute("readonly") === false) {
      document.getElementById("inp").setAttribute("readonly", true);
    } else {
      document.getElementById("inp").removeAttribute("readonly");
    }
    if (
      document.getElementById("inp2").hasAttribute("readonly") === false
    ) {
      document.getElementById("inp2").setAttribute("readonly", true);
    } else {
      document.getElementById("inp2").removeAttribute("readonly");
    }
    if (
      document.getElementById("inp3").hasAttribute("readonly") === false
    ) {
      document.getElementById("inp3").setAttribute("readonly", true);
    } else {
      document.getElementById("inp3").removeAttribute("readonly");
    }
    if (
      document.getElementById("inp4").hasAttribute("readonly") === false
    ) {
      document.getElementById("inp4").setAttribute("readonly", true);
    } else {
      document.getElementById("inp4").removeAttribute("readonly");
    }
    var diff = document.getElementById("edit-btn");
    if (diff.value == "Save") diff.value = "Edit";
    else diff.value = "Save";
    //document.getElementById("inp").removeAttribute("readonly");
  };