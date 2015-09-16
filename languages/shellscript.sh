
# 1. Example -----------------------------

#!/bin/bash
for jpg; do
  png="${jpg%.jpg}.png"
  echo converting "$jpg" ...
  if convert "$jpg" jpg.to.png ; then
    mv jpg.to.png "$png"
  else
    echo 'jpg2png: error: failed output saved in "jpg.to.png".' >&2
    exit 1
  fi
done
echo all conversions successful
exit 0


# 2. Tests -----------------------------
