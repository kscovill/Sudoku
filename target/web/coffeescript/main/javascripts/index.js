(function() {
  $(function() {
    return $.get("/tasks", function(data) {
      return $.each(data, function(index, task) {
        return $("#tasks").append($("<li>").text(task.contents));
      });
    });
  });

}).call(this);

//# sourceMappingURL=index.js.map
